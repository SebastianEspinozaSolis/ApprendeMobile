package cl.grupo_uno.apprende;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuProvicional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_provicional);

        Button botonApoderado = (Button) findViewById(R.id.botonMenuApoderado);
        Button botonAlumno = (Button) findViewById(R.id.botonMenuAlumno);
        Button botonAdministrador = (Button) findViewById(R.id.botonMenuAdministrador);
        Button botonProfesor = (Button) findViewById(R.id.botonMenuProfesor);

        botonApoderado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuProvicional.this,MenuApoderado.class));
            }
        });

        botonAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuProvicional.this,MenuAlumno.class));
            }
        });

        botonAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuProvicional.this,MenuAdministrador.class));
            }
        });

        botonProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuProvicional.this,MenuProfesor.class));
            }
        });
    }
}