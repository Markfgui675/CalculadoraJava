package com.example.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSomar;
    Button btnSubtratir;
    Button btnMultiplicar;
    Button btnDividir;
    EditText editNumA, editNumB;
    TextView txtResp, txtOperador;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSomar = findViewById(R.id.btnSomar);
        btnSubtratir = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        editNumA = findViewById(R.id.editNumA);
        editNumB = findViewById(R.id.editNumB);

        btnSomar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                boolean dadosOk = true;

                if (TextUtils.isEmpty(editNumA.getText().toString()) || TextUtils.isEmpty(editNumB.getText().toString())){
                    if (TextUtils.isEmpty(editNumA.getText().toString())){
                        editNumA.setError("*");
                    }
                    if (TextUtils.isEmpty(editNumB.getText().toString())){
                        editNumB.setError("*");
                    }
                    dadosOk = false;
                }

                if(dadosOk){
                    float a = Float.parseFloat(String.valueOf(editNumA.getText()));
                    float b = Float.parseFloat(String.valueOf(editNumB.getText()));
                    float resp = a + b;

                    txtResp = findViewById(R.id.txtResp);
                    txtResp.setText("A soma é: "+resp);

                    txtOperador = findViewById(R.id.txtOperador);
                    txtOperador.setText("+");
                } else {
                    Toast.makeText(getBaseContext(), "Digite os números!", Toast.LENGTH_LONG).show();
                }


            }
        });

        btnSubtratir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean dadosOk = true;

                if (TextUtils.isEmpty(editNumA.getText().toString()) || TextUtils.isEmpty(editNumB.getText().toString())){
                    if (TextUtils.isEmpty(editNumA.getText().toString())){
                        editNumA.setError("Digite um número!");
                    }
                    if(TextUtils.isEmpty(editNumB.getText().toString())){
                        editNumB.setError("Digite um número!");
                    }
                    dadosOk = false;

                }

                if(dadosOk){
                    float a = Float.parseFloat(String.valueOf(editNumA.getText()));
                    float b = Float.parseFloat(String.valueOf(editNumB.getText()));
                    float resp = a - b;

                    txtResp = findViewById(R.id.txtResp);
                    txtResp.setText("A subtração vale: "+resp);

                    txtOperador = findViewById(R.id.txtOperador);
                    txtOperador.setText("-");
                } else{
                    Toast.makeText(getBaseContext(), "Digite os números!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean dadosOk = true;

                if (TextUtils.isEmpty(editNumA.getText().toString()) || TextUtils.isEmpty(editNumB.getText().toString())){

                    if(TextUtils.isEmpty(editNumA.getText().toString())){
                        editNumA.setError("Digite um número!");
                    }
                    if(TextUtils.isEmpty(editNumB.getText().toString())){
                        editNumB.setError("Digite um número!");
                    }
                    dadosOk = false;

                }

                if(dadosOk){
                    float a = Float.parseFloat(String.valueOf(editNumA.getText()));
                    float b = Float.parseFloat(String.valueOf(editNumB.getText()));
                    float resp = a*b;

                    txtResp = findViewById(R.id.txtResp);
                    txtResp.setText("O produto vale: "+resp);

                    txtOperador = findViewById(R.id.txtOperador);
                    txtOperador.setText("X");
                } else {
                    Toast.makeText(getBaseContext(), "Digite os números!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean dadosOk = true;

                if (TextUtils.isEmpty(editNumA.getText().toString()) || TextUtils.isEmpty(editNumB.getText().toString())){

                    if(TextUtils.isEmpty(editNumA.getText().toString())){
                        editNumA.setError("Digite um número!");
                    }
                    if(TextUtils.isEmpty(editNumB.getText().toString())){
                        editNumB.setError("Digite um número!");
                    }
                    dadosOk = false;

                }

                if(dadosOk){
                    float a = Float.parseFloat(String.valueOf(editNumA.getText()));
                    float b = Float.parseFloat(String.valueOf(editNumB.getText()));
                    float resp = a/b;

                    txtResp = findViewById(R.id.txtResp);
                    txtResp.setText("O quociente vale: "+resp);

                    txtOperador = findViewById(R.id.txtOperador);
                    txtOperador.setText("/");
                } else {
                    Toast.makeText(getBaseContext(), "Digite os números!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}