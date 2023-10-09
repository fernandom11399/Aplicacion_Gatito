package com.example.gatito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    TextView nada;
    TextView amarillo;

    int contadoramarillo = 0;
    int contadornegro = 0;
    TextView negro;
    Button reinicartodo;
    Button reiniciarronda;
    Button uno;
    Button dos;
    Button tres;
    Button cuatro;
    Button cinco;
    Button seis;
    Button siete;
    Button ocho;
    Button nueve;
    boolean turnos = true;
    boolean unavez1 = true;
    boolean unavez2 = true;
    boolean unavez3 = true;
    boolean unavez4 = true;
    boolean unavez5 = true;
    boolean unavez6 = true;
    boolean unavez7 = true;
    boolean unavez8 = true;
    boolean unavez9 = true;
    boolean gandorx = false;
    boolean gandoro = false;
    boolean nadie = false;
    boolean turnoamarillo = true;
    boolean turnonegro = false;
    int amarillocontador = 0;
    int negrocontador = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MainActivity3.class);
        Bundle b = new Bundle();
        Bundle bundled = getIntent().getExtras();

        if (bundled != null) {
            amarillocontador = bundled.getInt("amarillocontador");
            negrocontador = bundled.getInt("negrocontador");
        }

        reinicartodo = findViewById(R.id.reinicartodo);
        reinicartodo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amarillo.setVisibility(View.INVISIBLE);
                negro.setVisibility(View.INVISIBLE);
                uno.setText(".");
                dos.setText(".");
                tres.setText(".");
                cuatro.setText(".");
                cinco.setText(".");
                seis.setText(".");
                siete.setText(".");
                ocho.setText(".");
                nueve.setText(".");
                turnos = true;
                unavez1 = true;
                unavez3 = true;
                unavez2 = true;
                unavez4 = true;
                unavez5 = true;
                unavez6 = true;
                unavez7 = true;
                unavez8 = true;
                unavez9 = true;
                gandorx = false;
                gandoro = false;
                nadie = false;
                amarillocontador = 0;
                negrocontador = 0;
            }
        });

        reiniciarronda = findViewById(R.id.reinicarronda);
        reiniciarronda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amarillo.setVisibility(View.INVISIBLE);
                negro.setVisibility(View.INVISIBLE);
                uno.setText(".");
                dos.setText(".");
                tres.setText(".");
                cuatro.setText(".");
                cinco.setText(".");
                seis.setText(".");
                siete.setText(".");
                ocho.setText(".");
                nueve.setText(".");
                turnos = true;
                unavez1 = true;
                unavez3 = true;
                unavez2 = true;
                unavez4 = true;
                unavez5 = true;
                unavez6 = true;
                unavez7 = true;
                unavez8 = true;
                unavez9 = true;
                gandoro = false;
                gandorx = false;
                nadie = false;
            }
        });

        uno = findViewById(R.id.primero);
        amarillo = findViewById(R.id.gatitoamarillo);
        negro = findViewById(R.id.gatitonegro);
        nada = findViewById(R.id.nadie);
        uno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez1){
                    if(turnos){
                        uno.setText("x");
                        turnos = false;
                    }else {
                        uno.setText("⊘");
                        turnos = true;
                    }
                    unavez1 = false;
                }
                String casill1 = uno.getText().toString();
                String casill2 = dos.getText().toString();
                String casill3 = tres.getText().toString();
                String casill4 = cuatro.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill7 = siete.getText().toString();
                String casill9 = nueve.getText().toString();

                if(casill1.equals("x") && casill2.equals("x") && casill3.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill1.equals("x") && casill4.equals("x") && casill7.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill1.equals("x") && casill5.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill1.equals("⊘") && casill4.equals("⊘") && casill7.equals("⊘")){
                    gandoro = true;
                    negrocontador++;

                }
                if(casill1.equals("⊘") && casill5.equals("⊘") && casill9.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill1.equals("⊘") && casill2.equals("⊘") && casill3.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }
                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }




            }
        });

        dos = findViewById(R.id.segundo);
        dos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez2){
                    if(turnos){
                        dos.setText("x");
                        turnos = false;
                    }else {
                        dos.setText("⊘");
                        turnos = true;
                    }
                    unavez2 = false;
                }
                String casill1 = uno.getText().toString();
                String casill2 = dos.getText().toString();
                String casill3 = tres.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill8 = ocho.getText().toString();

                if(casill1.equals("x") && casill2.equals("x") && casill3.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill2.equals("x") && casill5.equals("x") && casill8.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill1.equals("⊘") && casill2.equals("⊘") && casill3.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill2.equals("⊘") && casill5.equals("⊘") && casill8.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }

                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });

        tres = findViewById(R.id.tercero);
        tres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez3){
                    if(turnos){
                        tres.setText("x");
                        turnos = false;
                    }else {
                        tres.setText("⊘");
                        turnos = true;
                    }
                    unavez3 = false;
                }
                String casill1 = uno.getText().toString();
                String casill2 = dos.getText().toString();
                String casill3 = tres.getText().toString();
                String casill6 = seis.getText().toString();
                String casill9 = nueve.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill7 = siete.getText().toString();

                if(casill1.equals("x") && casill2.equals("x") && casill3.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill3.equals("x") && casill6.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill7.equals("x") && casill5.equals("x") && casill3.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill1.equals("⊘") && casill2.equals("⊘") && casill3.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill9.equals("⊘") && casill6.equals("⊘") && casill3.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill7.equals("⊘") && casill5.equals("⊘") && casill3.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }
                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });

        cuatro = findViewById(R.id.cuarto);
        cuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez4){
                    if(turnos){
                        cuatro.setText("x");
                        turnos = false;
                    }else {
                        cuatro.setText("⊘");
                        turnos = true;
                    }
                    unavez4 = false;
                }
                String casill1 = uno.getText().toString();
                String casill4 = cuatro.getText().toString();
                String casill7 = siete.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill6 = seis.getText().toString();

                if(casill1.equals("x") && casill4.equals("x") && casill7.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill5.equals("x") && casill4.equals("x") && casill6.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill1.equals("⊘") && casill4.equals("⊘") && casill7.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill4.equals("⊘") && casill5.equals("⊘") && casill6.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }

                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }
                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });

        cinco = findViewById(R.id.quinto);
        cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez5){
                    if(turnos){
                        cinco.setText("x");
                        turnos = false;
                    }else {
                        cinco.setText("⊘");
                        turnos = true;
                    }
                    unavez5 = false;
                }
                String casill1 = uno.getText().toString();
                String casill2 = dos.getText().toString();
                String casill3 = tres.getText().toString();
                String casill4 = cuatro.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill6 = seis.getText().toString();
                String casill7 = siete.getText().toString();
                String casill8 = ocho.getText().toString();
                String casill9 = nueve.getText().toString();

                if(casill3.equals("x") && casill5.equals("x") && casill7.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill1.equals("x") && casill5.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill4.equals("x") && casill5.equals("x") && casill6.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill2.equals("x") && casill5.equals("x") && casill8.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill3.equals("⊘") && casill5.equals("⊘") && casill7.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill1.equals("⊘") && casill5.equals("⊘") && casill9.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if(casill4.equals("⊘") && casill5.equals("⊘") && casill6.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill2.equals("⊘") && casill5.equals("⊘") && casill8.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }
                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });

        seis = findViewById(R.id.sexto);
        seis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez6){
                    if(turnos){
                        seis.setText("x");
                        turnos = false;
                    }else {
                        seis.setText("⊘");
                        turnos = true;
                    }
                    unavez6 = false;
                }
                String casill4 = cuatro.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill6 = seis.getText().toString();
                String casill3 = tres.getText().toString();
                String casill9 = nueve.getText().toString();

                if(casill4.equals("x") && casill5.equals("x") && casill6.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill3.equals("x") && casill6.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill4.equals("⊘") && casill5.equals("⊘") && casill6.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill3.equals("⊘") && casill6.equals("⊘") && casill9.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }

                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });

        siete = findViewById(R.id.septimo);
        siete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez7){
                    if(turnos){
                        siete.setText("x");
                        turnos = false;
                    }else {
                        siete.setText("⊘");
                        turnos = true;
                    }
                    unavez7 = false;
                }
                String casill1 = uno.getText().toString();
                String casill4 = cuatro.getText().toString();
                String casill7 = siete.getText().toString();
                String casill8 = ocho.getText().toString();
                String casill9 = nueve.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill3 = tres.getText().toString();

                if(casill1.equals("x") && casill4.equals("x") && casill7.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill9.equals("x") && casill8.equals("x") && casill7.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill3.equals("x") && casill5.equals("x") && casill7.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;
                }
                if(casill1.equals("⊘") && casill4.equals("⊘") && casill7.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                }
                if(casill9.equals("⊘") && casill8.equals("⊘") && casill7.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if(casill3.equals("⊘") && casill5.equals("⊘") && casill7.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }
                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });

        ocho = findViewById(R.id.octavo);
        ocho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez8){
                    if(turnos){
                        ocho.setText("x");
                        turnos = false;
                    }else {
                        ocho.setText("⊘");
                        turnos = true;
                    }
                    unavez8 = false;
                }
                String casill7 = siete.getText().toString();
                String casill8 = ocho.getText().toString();
                String casill9 = nueve.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill2 = dos.getText().toString();

                if(casill7.equals("x") && casill8.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill2.equals("x") && casill5.equals("x") && casill8.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill7.equals("⊘") && casill8.equals("⊘") && casill9.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if(casill2.equals("⊘") && casill5.equals("⊘") && casill8.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;
                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }

                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });

        nueve = findViewById(R.id.noveno);
        nueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(unavez9){
                    if(turnos){
                        nueve.setText("x");
                        turnos = false;
                    }else {
                        nueve.setText("⊘");
                        turnos = true;
                    }
                    unavez9 = false;
                }
                String casill1 = uno.getText().toString();
                String casill5 = cinco.getText().toString();
                String casill9 = nueve.getText().toString();
                String casill3 = tres.getText().toString();
                String casill6 = seis.getText().toString();
                String casill7 = siete.getText().toString();
                String casill8 = ocho.getText().toString();

                if(casill7.equals("x") && casill8.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill3.equals("x") && casill6.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill1.equals("x") && casill5.equals("x") && casill9.equals("x")){
                    gandorx = true;
                    amarillo.setVisibility(View.VISIBLE);
                    amarillocontador++;

                }
                if(casill7.equals("⊘") && casill8.equals("⊘") && casill9.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if(casill1.equals("⊘") && casill5.equals("⊘") && casill9.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if(casill3.equals("⊘") && casill6.equals("⊘") && casill9.equals("⊘")){
                    gandoro = true;
                    negro.setVisibility(View.VISIBLE);
                    negrocontador++;

                }
                if((!gandoro && !gandorx) && (!unavez1 && !unavez2 && !unavez3 && !unavez4 && !unavez5 &&
                        !unavez6 && !unavez7 && !unavez8 && !unavez9)){
                    nada.setVisibility(View.VISIBLE);
                    nadie = true;
                }
                if(gandorx || gandoro || nadie) {
                    CountDownTimer tiempoganado = new CountDownTimer(3000, 1000) {
                        @Override
                        public void onTick(long l) {
                        }

                        @Override
                        public void onFinish() {
                            if (gandoro) {
                                negro.setVisibility(View.INVISIBLE);
                            }
                            if (gandorx) {
                                amarillo.setVisibility(View.INVISIBLE);
                            }
                            if (nadie) {
                                nada.setVisibility(View.INVISIBLE);
                            }
                            uno.setText(".");
                            dos.setText(".");
                            tres.setText(".");
                            cuatro.setText(".");
                            cinco.setText(".");
                            seis.setText(".");
                            siete.setText(".");
                            ocho.setText(".");
                            nueve.setText(".");
                            turnos = true;
                            unavez1 = true;
                            unavez3 = true;
                            unavez2 = true;
                            unavez4 = true;
                            unavez5 = true;
                            unavez6 = true;
                            unavez7 = true;
                            unavez8 = true;
                            unavez9 = true;
                            gandorx = false;
                            gandoro = false;
                            nadie = false;
                            b.putInt("amarillocontador", amarillocontador);
                            b.putInt("negrocontador", negrocontador);
                            i.putExtras(b);
                            startActivity(i);
                        }
                    }.start();
                }
            }
        });
    }
}