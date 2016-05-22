package com.next.capturardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button siguiente;


    EditText nombre;
    EditText birthday;
    EditText telefono;
    EditText email;
    EditText info;

    TextView mostar_nombre;
    TextView mostrar_birthday;
    TextView mostrar_telefono;
    TextView mostrar_email;
    TextView mostrar_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente = (Button) findViewById(R.id.botonSiguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, MostrarDatos.class);
                startActivity(siguiente);
            }

        });



    }



}
