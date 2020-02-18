package br.app.aula2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }

    public void abrirTela1(View botao) {
        Intent it = new Intent(this, Tela1.class);

        startActivity(it);
    }

}
