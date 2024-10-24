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

public class CrearAdministrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_administrador);

        EditText nombre = (EditText) findViewById(R.id.editNombreAdmin);
        EditText rut = (EditText) findViewById(R.id.editRutAdmin);
        EditText cargo = (EditText) findViewById(R.id.editCargoAdmin);
        EditText fechaNac = (EditText) findViewById(R.id.editFechaNacAdmin);
        EditText sexo = (EditText) findViewById(R.id.editSexoAdmin);
        EditText correo = (EditText) findViewById(R.id.editCorreoAdmin);
        EditText contraseña = (EditText) findViewById(R.id.editContraseñaAdmin);
        Button btnCrearAdmin = (Button) findViewById(R.id.botonRegistrarAdmin);

        btnCrearAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre != null && rut != null && cargo != null && fechaNac != null && correo != null && contraseña != null && sexo != null){
                    String nombreCapt = nombre.getText().toString();
                    String rutCapt = rut.getText().toString();
                    String cargoCapt = cargo.getText().toString();
                    String fechaNacCapt = fechaNac.getText().toString();
                    String correoCapt = correo.getText().toString();
                    String contraseñaCapt = contraseña.getText().toString();
                    String sexoCapt = sexo.getText().toString();
                }
            }
        });
    }
}