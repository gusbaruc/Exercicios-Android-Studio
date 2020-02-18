package br.app.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tela01 extends AppCompatActivity {

    private EditText txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela01);

        txtNome = (EditText) findViewById(R.id.txtNome);
    }


    public void enviar(View botao) {
        String nome = txtNome.getText().toString();

        Intent it = new Intent(this, TelaResultado.class);

        it.putExtra("nomePessoa", nome);

        startActivity(it);
    }

}
