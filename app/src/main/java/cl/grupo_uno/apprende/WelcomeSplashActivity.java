package cl.grupo_uno.apprende;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_splash);

        // Temporizador para la pantalla de bienvenida
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Redirige al menú de inicio
                startActivity(new Intent(WelcomeSplashActivity.this, MenuProvicional.class));
                finish();
            }
        }, 2000); // duración en milisegundos
    }
}
