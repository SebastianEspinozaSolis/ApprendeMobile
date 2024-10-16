package cl.grupo_uno.apprende;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        //Para los segundos
        Handler handler = new Handler();

        // este metodo sera un temporizador que sucedera en los milisegundos que se le dan como segundo argumento, en este caso 2000 milisegundos que son 2 segundos
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // la app verifica si hay conexion, si la hay continua, de lo contrario alerta sobre conectarse o no podra acceder
                if(hayConexion(Splash.this)){
                    // envia a mainactivity que tiene el inicio de sesion y termina la activity para no poder regresar a esta
                    startActivity(new Intent(Splash.this,MainActivity.class));
                    finish();
                }else{
                    // Este es el alert sobre que no hay conexion
                    AlertDialog.Builder miAlert = new AlertDialog.Builder(Splash.this);
                    miAlert.setTitle("No hay acceso a internet");
                    miAlert.setMessage("Por favor, active los datos o wifi para usar la app!");
                    miAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    // aqui se llama
                    AlertDialog dialog = miAlert.show();
                    // para que no desaparezca por tocar hay que
                    dialog.setCanceledOnTouchOutside(false);
                    dialog.setCancelable(false);
                }
            }
        },2000);
    }
    // funcion que comprueba si hay conexion, se necesita que en manifest se hayan declarado los permisos correspondiente para usarla
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