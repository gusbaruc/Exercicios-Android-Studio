package br.app.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    private EditText txtValorA;
    private EditText txtValorB;
    private EditText txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        txtValorA = (EditText) findViewById(R.id.txtValorA);
        txtValorB = (EditText) findViewById(R.id.txtValorB);
        txtResultado = (EditText) findViewById(R.id.txtResultado);
    }

    public void somar(View botao) {
        int a, b, res;

        a = Integer.parseInt(txtValorA.getText().toString());
        b = Integer.parseInt(txtValorB.getText().toString());

        res = a + b;

        txtResultado.setText(String.valueOf(res));
    }

    public void subtrair(View botao) {
        int a, b, res;

        a = Integer.parseInt(txtValorA.getText().toString());
        b = Integer.parseInt(txtValorB.getText().toString());

        res = a - b;

        txtResultado.setText(String.valueOf(res));
    }

    public void multiplicar(View botao) {
        int a, b, res;

        a = Integer.parseInt(txtValorA.getText().toString());
        b = Integer.parseInt(txtValorB.getText().toString());

        res = a * b;

        txtResultado.setText(String.valueOf(res));
    }

    public void dividir(View botao) {
        int a, b, res;

        a = Integer.parseInt(txtValorA.getText().toString());
        b = Integer.parseInt(txtValorB.getText().toString());

        res = a / b;

        txtResultado.setText(String.valueOf(res));
    }

}
