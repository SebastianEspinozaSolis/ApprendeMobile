package cl.grupo_uno.apprende;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CrearProfesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_profesor);

        EditText nombre = (EditText) findViewById(R.id.editNombreProfesor);
        EditText rut = (EditText) findViewById(R.id.editRutProfesor);
        EditText especialidad = (EditText) findViewById(R.id.editEspecialidadProfesor);
        EditText fechaNac = (EditText) findViewById(R.id.editFechaNacProfesor);
        EditText sexo = (EditText) findViewById(R.id.editSexoProfesor);
        EditText correo = (EditText) findViewById(R.id.editCorreoProfesor);
        EditText contraseña = (EditText) findViewById(R.id.editContraseñaProfesor);
        Button btnCrearProfe = (Button) findViewById(R.id.botonRegistrarProfesor);

        btnCrearProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre != null && rut != null && especialidad != null && fechaNac != null && correo != null && contraseña != null && sexo != null){
                    String nombreCapt = nombre.getText().toString();
                    String rutCapt = rut.getText().toString();
                    String especialidadCapt = especialidad.getText().toString();
                    String fechaNacCapt = fechaNac.getText().toString();
                    String correoCapt = correo.getText().toString();
                    String contraseñaCapt = contraseña.getText().toString();
                    String sexoCapt = sexo.getText().toString();
                }
            }
        });
    }
}