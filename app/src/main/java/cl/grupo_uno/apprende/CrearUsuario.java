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

public class CrearUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_usuario);

        Button btnCrearAlumno = (Button) findViewById(R.id.creacionAlumno);
        Button btnCrearApoderado = (Button) findViewById(R.id.creacionApoderado);
        Button btnCrearProfesor = (Button) findViewById(R.id.creacionProfesor);
        Button btnCrearAdministrador = (Button) findViewById(R.id.creacionAdministrador);

        btnCrearAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearUsuario.this,CrearApoderado1.class));
            }
        });

        btnCrearApoderado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearUsuario.this, CrearApoderado2.class));
            }
        });
        btnCrearProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearUsuario.this, CrearProfesor.class));
            }
        });

        btnCrearAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearUsuario.this, CrearAdministrador.class));
            }
        });
    }
}