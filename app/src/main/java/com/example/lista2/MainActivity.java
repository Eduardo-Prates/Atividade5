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
        EditText e3 = (EditText) findViewById(R.id.telefone);
        EditText e4 = (EditText) findViewById(R.id.senhaOrkut);
        EditText e5 = (EditText) findViewById(R.id.email);

        TextView t1 = (TextView) findViewById(R.id.printNome);

        Button b1 = (Button) findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1Texto = e1.getText()+"-"+e2.getText()+"-"+e3.getText()+"-"+e4.getText()+"-"+e5.getText();
                t1.setText("Nome: "+e1.getText()+"\nSenha :"+e2.getText()+"\nTelefone: "+e3.getText()+"\nSenha do Orkut: "+e4.getText()+"\nEmail: "+e5.getText() );
                Toast.makeText(getApplicationContext(), t1Texto.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}