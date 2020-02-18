package br.app.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaResultado extends AppCompatActivity {

    private TextView lblNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_resultado);

        //Objeto que irá exibir o conteúdo enviado da
        //tela anterior
        lblNome = (TextView) findViewById(R.id.lblNome);

        //Recuperando o Intent da tela anterior
        Intent it = getIntent();

        //Recuperando o conteúdo da tela anterior
        String nomeRecuperado = it.getStringExtra("nomePessoa");

        //Setando o conteúdo recuperado para ser
        //exibido no TextView
        lblNome.setText(nomeRecuperado);
    }
}






