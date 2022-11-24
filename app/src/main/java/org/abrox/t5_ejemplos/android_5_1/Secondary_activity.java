package org.abrox.t5_ejemplos.android_5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Secondary_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        String nombre = getIntent().getStringExtra("extranombre");
        TextView ed = (TextView) findViewById(R.id.banner);

        getIntent().getStringExtra("extranombre", nombre);//devuelve el intent que me ha invocado.
    }
}