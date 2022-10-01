package com.example.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    int tempoEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        trocarTela();

    }

    private void trocarTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent trocarTela = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(trocarTela);
                finish();

            }
        }, tempoEspera);

    }
}