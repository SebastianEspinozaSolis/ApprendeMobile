package cl.grupo_uno.apprende;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CrearAlumno2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_alumno2);

        TextView texto = (TextView) findViewById(R.id.textoPrueba);

        Bundle bundle = getIntent().getExtras();
        texto.setText(bundle.getString("nombre"));
    }
}