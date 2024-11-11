package cl.grupo_uno.apprende;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuAlumno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_alumno);

        // Referencia al botón
        Button botonPomodoro = findViewById(R.id.botonPomodoro);

        // Configurar el evento de clic en el botón
        botonPomodoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para abrir el navegador con la URL de Pomofocus
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pomofocus.io/"));
                startActivity(intent);
            }

        });
        // Referencia al botón
        Button botonOtrasTecnicas = findViewById(R.id.botonOtrasTecnicas);

        // Configurar el evento de clic en el botón
        botonOtrasTecnicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para abrir el navegador con la URL de Pomofocus
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ayuda.inacaponline.cl/hc/es-419/articles/28848731101460-M%C3%A9todos-de-estudio-efectivos"));
                startActivity(intent);
            }

        });

        // Referencia al botón de contacto
        Button botonContacto = findViewById(R.id.botonContacto);

        // Configurar el evento de clic en el botón de contacto
        botonContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Número de teléfono que deseas marcar
                String phoneNumber = "tel: +569422831800";

                // Intent para iniciar la aplicación de teléfono con el número marcado
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(phoneNumber));
                startActivity(intent);
            }
        });
    }
}