package cl.grupo_uno.apprende;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CrearAlumno1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_alumno1);
        EditText nombre = (EditText) findViewById(R.id.editNombreAlumno);
        EditText rut = (EditText) findViewById(R.id.editRutAlumno);
        EditText fechaNac = (EditText) findViewById(R.id.editFechaNacAlumno);
        EditText sexo = (EditText) findViewById(R.id.editSexoAlumno);
        EditText correo = (EditText) findViewById(R.id.editCorreoAlumno);
        EditText contraseña = (EditText) findViewById(R.id.editContraseñaAlumno);
        Button btnSiguienteAlumno = (Button) findViewById(R.id.botonSiguienteAlumno);

        btnSiguienteAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre != null && rut != null&& fechaNac != null && correo != null && contraseña != null && sexo != null){
                    String nombreCapt = nombre.getText().toString();
                    String rutCapt = rut.getText().toString();
                    String fechaNacCapt = fechaNac.getText().toString();
                    String correoCapt = correo.getText().toString();
                    String contraseñaCapt = contraseña.getText().toString();
                    String sexoCapt = sexo.getText().toString();

                    Intent i = new Intent(CrearAlumno1.this, CrearAlumno2.class);
                    i.putExtra("nombre",nombreCapt);
                    startActivity(i);
                }
            }
        });
    }
}