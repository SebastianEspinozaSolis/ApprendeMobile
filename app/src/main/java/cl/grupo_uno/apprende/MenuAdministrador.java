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

public class MenuAdministrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_administrador);

        Button botonDatos = (Button) findViewById(R.id.botonIngresarDatos);
        Button botonAviso = (Button) findViewById(R.id.botonAviso);
        Button botonCrearUsuario = (Button) findViewById(R.id.botonCrearUsuario);

        botonDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdministrador.this,AgregarDatos.class));
            }
        });

        botonAviso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdministrador.this,CrearAvisos.class));
            }
        });

        botonCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdministrador.this,CrearUsuario.class));
            }
        });
    }
}