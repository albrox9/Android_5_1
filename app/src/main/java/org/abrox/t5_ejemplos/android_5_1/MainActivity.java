package org.abrox.t5_ejemplos.android_5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abrirVentana(View view) {

        //Creamos el intento para abrir la secondaryactivity
        Intent i = new Intent(this, Secondary_activity.class);

        EditText et = findViewById(R.id.idEdit);
        String texto = et.getText().toString();

        //antes de arrancar le paso datos. Añadirle al intent tantos datos como queramos.
        i.putExtra("extranombre", texto);
        //arrancamos la activity.
        startActivity(i);

    }
}