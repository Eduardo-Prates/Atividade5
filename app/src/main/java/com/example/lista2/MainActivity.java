package com.example.lista2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.nome);
        EditText e3 = (EditText) findViewById(R.id.telefone);
        EditText e4 = (EditText) findViewById(R.id.senhaOrkut);

        TextView t1 = (TextView) findViewById(R.id.printNome);

        Button b1 = (Button) findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = Double.parseDouble(e1.getText().toString()) / Double.parseDouble(e3.getText().toString()) * Double.parseDouble(e4.getText().toString());
                t1.setText("Custo: R$ "+ total);
            }
        });
    }
}