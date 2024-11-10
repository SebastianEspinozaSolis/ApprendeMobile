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
    }
}