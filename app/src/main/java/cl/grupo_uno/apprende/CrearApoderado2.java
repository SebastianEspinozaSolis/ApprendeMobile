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

public class CrearApoderado2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_apoderado2);
        EditText nombre = (EditText) findViewById(R.id.editNombreApoderado);
        EditText rut = (EditText) findViewById(R.id.editRutApoderado);
        EditText fono = (EditText) findViewById(R.id.editFonoApoderado);
        EditText fechaNac = (EditText) findViewById(R.id.editFechaNacApoderado);
        EditText sexo = (EditText) findViewById(R.id.editSexoApoderado);
        EditText correo = (EditText) findViewById(R.id.editCorreoApoderado);
        EditText contraseña = (EditText) findViewById(R.id.editContraseñaApoderado);
        Button btnCrearApoderado = (Button) findViewById(R.id.botonRegistrarApoderado);

        btnCrearApoderado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre != null && rut != null && fono != null && fechaNac != null && correo != null && contraseña != null && sexo != null){
                    String nombreCapt = nombre.getText().toString();
                    String rutCapt = rut.getText().toString();
                    String fonoCapt = fono.getText().toString();
                    String fechaNacCapt = fechaNac.getText().toString();
                    String correoCapt = correo.getText().toString();
                    String contraseñaCapt = contraseña.getText().toString();
                    String sexoCapt = sexo.getText().toString();
                }
            }
        });
    }
}