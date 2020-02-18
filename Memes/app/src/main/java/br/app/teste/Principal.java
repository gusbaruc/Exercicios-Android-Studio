package br.app.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }

    public void abrirTela01(View botao) {
        startActivity(new Intent(this, Tela01.class));
    }

    public void abrirTela02(View botao) {
        startActivity(new Intent(this, Tela02.class));
    }

}
