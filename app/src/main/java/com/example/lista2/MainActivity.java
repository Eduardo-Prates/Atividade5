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
        EditText e2 = (EditText) findViewById(R.id.senha);
        EditText e3 = (EditText) findViewById(R.id.dataVenc);

        TextView t1 = (TextView) findViewById(R.id.printNome);

        Button b1 = (Button) findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1Texto = "Nome: "+e1.getText()+"Senha :"+e2.getText()+"Vencimento: "+e3.getText();
                t1.setText("Nome: "+e1.getText()+"\nSenha :"+e2.getText()+"\nVencimento: "+e3.getText() );
                Toast.makeText(getApplicationContext(), t1Texto.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}