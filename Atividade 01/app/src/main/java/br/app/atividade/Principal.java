package br.app.atividade;

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

    public void click_Rest(View button){
        Intent it = new Intent(this, Restaurante.class);
        startActivity(it);
    }

    public void click_Sal(View button){
        Intent it = new Intent(this, Salario.class);
        startActivity(it);
    }

    public void click_Rod(View button){
        Intent it = new Intent(this, Rodizio.class);
        startActivity(it);
    }
}