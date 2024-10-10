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

        EditText editUsuario = (EditText) findViewById(R.id.editUsuario);
        EditText editClave = (EditText) findViewById(R.id.editClave);
        Button botonIniciar = (Button) findViewById(R.id.botonIniciar);

        String usuarioAdmin = "usuario@gmail.com";
        String claveAdmin = "Password1";

        botonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hayConexion(MainActivity.this)){
                    String usuarioCapturado = editUsuario.getText().toString();
                    String claveCapturada = editClave.getText().toString();

                    if (usuarioCapturado.equalsIgnoreCase(usuarioAdmin) && claveCapturada.equalsIgnoreCase(claveAdmin)){
                        startActivity(new Intent(MainActivity.this,MenuProvicional.class));
                        finish();
                    }else {
                        Toast.makeText(MainActivity.this, "Credenciales Invalidas", Toast.LENGTH_SHORT).show();
                    }
                    editUsuario.setText("");
                    editClave.setText("");
                }else{
                    //Toast.makeText(Splash.this, "Sin conexion", Toast.LENGTH_SHORT).show();
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