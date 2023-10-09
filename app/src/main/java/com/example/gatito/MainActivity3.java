package com.example.gatito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView contadoramarillo;
    TextView contadornegro;
    int amarillocontador;
    int negrocontador;
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        contadoramarillo = findViewById(R.id.contadoramarillo);
        contadornegro = findViewById(R.id.contadornegro);

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        Bundle bundled = getIntent().getExtras();

        if (bundled != null) {
            amarillocontador = bundled.getInt("amarillocontador");
            negrocontador = bundled.getInt("negrocontador");
        }

        contadoramarillo.setText(String.valueOf(amarillocontador));
        contadornegro.setText(String.valueOf(negrocontador));

        regresar = findViewById(R.id.jugardenuevo);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putInt("amarillocontador", amarillocontador);
                bundle.putInt("negrocontador", negrocontador);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
