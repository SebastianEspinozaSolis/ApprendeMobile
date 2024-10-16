package cl.grupo_uno.apprende;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // se declaran los edits para sacar los valores que tiene y el boton para cuando se interactua con el
        EditText editUsuario = (EditText) findViewById(R.id.editUsuario);
        EditText editClave = (EditText) findViewById(R.id.editClave);
        Button botonIniciar = (Button) findViewById(R.id.botonIniciar);

        // esto son las credenciales que tenia, pero luego cuando se conecte a la base de datos se desapareceran
        String usuarioAdmin = "usuario@gmail.com";
        String claveAdmin = "Password1";

        // al tocar el boton iniciar
        botonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // comprobara si hay conexion
                if(hayConexion(MainActivity.this)){

                    // si hay conexion, guardara los valores de los edits como usuario y clave capturada
                    String usuarioCapturado = editUsuario.getText().toString();
                    String claveCapturada = editClave.getText().toString();

                    // comparara si estos son iguales a las credenciales que por ahora son las de arriba
                    if (usuarioCapturado.equalsIgnoreCase(usuarioAdmin) && claveCapturada.equalsIgnoreCase(claveAdmin)){
                        // Si son iguales, aunque no considera mayusculas de minusculas, envia al menu provicional y elimina esta activity de iniciar sesion
                        startActivity(new Intent(MainActivity.this,MenuProvicional.class));
                        finish();
                    }else {
                        // si no coinciden le dice al usuario que las credenciales son invalidas
                        Toast.makeText(MainActivity.this, "Credenciales Invalidas", Toast.LENGTH_SHORT).show();
                    }
                    // si son invalidas continua y los edits text les cambia el texto a sin nada para ingresar de nuevo todo
                    editUsuario.setText("");
                    editClave.setText("");
                }else{
                    // en el caso que no haya conexion al tocar el boton iniciar lo dira en el alert
                    // Este es el alert
                    AlertDialog.Builder miAlert = new AlertDialog.Builder(MainActivity.this);
                    miAlert.setTitle("No hay acceso a internet");
                    miAlert.setMessage("Por favor, active los datos o wifi para usar la app!");
                    miAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    // aqui se llama
                    AlertDialog dialog = miAlert.show();
                    // para que no desaparezca por tocar hay que
                    dialog.setCanceledOnTouchOutside(false);
                    dialog.setCancelable(false);
                }
            }
        });
    }
    // aqui esta nuevamente la funcion para ver si hay conexion o no
    public boolean hayConexion(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()){
            NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if ((wifi != null &&  wifi.isConnectedOrConnecting()) || (mobile != null && mobile.isConnectedOrConnecting())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}