package com.example.concatenao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView resu;
 Button btn;
 TextView txt1;
 TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resu = findViewById(R.id.txtr);
        btn = findViewById(R.id.btn);
        txt1 = findViewById(R.id.txt);
        txt2 = findViewById(R.id.txt2);
    }
      public void conc(View v) {
          String n = txt1.getText().toString();
          String m = txt2.getText().toString();

          if (n.isEmpty() && m.isEmpty()) {
              resu.setText("Nenhum nome foi inserido");
          }else if(n.isEmpty())
          {
              resu.setText("O 1º nome não foi inserido");
          }
          else if (m.isEmpty()){
          resu.setText("O 2º nome não foi inserido");
    }
     else {
        resu.setText("Olá " + n + " " + m);
      }}
    public void again (View Exibir) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    }