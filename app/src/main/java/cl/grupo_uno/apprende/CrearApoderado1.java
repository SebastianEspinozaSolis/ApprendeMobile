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

public class CrearApoderado1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_apoderado1);
        Button btnCrearApoderado = (Button) findViewById(R.id.botonCrearApoderado2);
        Button btnCrearAlumno = (Button) findViewById(R.id.botonCrearAlumno);

        btnCrearApoderado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearApoderado1.this,CrearApoderado2.class));
            }
        });
        btnCrearAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearApoderado1.this, CrearAlumno1.class));
            }
        });
    }
}