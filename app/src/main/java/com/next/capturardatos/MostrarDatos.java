package com.next.capturardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {
    Button editar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);



        editar = (Button) findViewById(R.id.btnEditar);
        editar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent editar = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(editar);
            }
        });
    }
}
