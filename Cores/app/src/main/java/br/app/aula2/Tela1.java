package br.app.aula2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Tela1 extends Activity {

    private RadioButton rdVermelho;
    private RadioButton rdVerde;
    private RadioButton rdAzul;
    private TextView lblTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela1);

        lblTitulo = (TextView) findViewById(R.id.lblTitulo);
        rdVermelho = (RadioButton) findViewById(R.id.rdVermelho);
        rdVerde = (RadioButton) findViewById(R.id.rdVerde);
        rdAzul = (RadioButton) findViewById(R.id.rdAzul);
    }

    public void clicar(View botao) {
        if (rdVermelho.isChecked()) {
            Toast
                .makeText(this, "VERMELHO", Toast.LENGTH_SHORT)
                .show();
        }

        if (rdVerde.isChecked()) {
            Toast
                .makeText(this, "VERDE", Toast.LENGTH_SHORT)
                .show();
        }

        if (rdAzul.isChecked()) {
            Toast
                .makeText(this, "AZUL", Toast.LENGTH_SHORT)
                .show();
        }
    }

    public void mudarCor(View botao) {
        if (rdVermelho.isChecked()) {
            lblTitulo.setBackgroundColor(Color.RED);
        }

        if (rdVerde.isChecked()) {
            //lblTitulo.setBackgroundColor(Color.GREEN);
            lblTitulo.setBackgroundColor(Color.rgb(102, 153, 0)); //Tom de verde
        }

        if (rdAzul.isChecked()) {
            lblTitulo.setBackgroundColor(Color.BLUE);
        }
    }

    public void fechar(View botao) {
        finish();
    }

}
