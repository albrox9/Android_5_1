package org.abrox.t5_ejemplos.android_5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Secondary_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Creo el método que mostrará el mensaje recibido desde la otra activity
        mensajeEnviado();
    }

    private void mensajeEnviado() {

        //Recojo el texto pasado a través de putExtra (tiene que coincidir la denominacion
        String texto = getIntent().getStringExtra("extranombre");

        //Lo muestro en un Toast.
        TextView tv = findViewById(R.id.idBanner);
        tv.setText("Hola " + texto);

    }
}