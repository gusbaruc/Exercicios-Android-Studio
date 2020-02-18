package br.app.atividade;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class Restaurante extends Activity {

    private EditText text_ConTot;
    private EditText text_CouvArt;
    private EditText text_DivConta;
    private EditText text_TaxServ;
    private EditText text_ValTot;
    private EditText text_ValPess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurante);

        text_ConTot = (EditText) findViewById(R.id.text_ConTot);
        text_CouvArt = (EditText) findViewById(R.id.text_CouvArt);
        text_DivConta = (EditText) findViewById(R.id.text_DivConta);
        text_TaxServ = (EditText) findViewById(R.id.text_TaxServ);
        text_ValTot = (EditText) findViewById(R.id.text_ValTot);
        text_ValPess = (EditText) findViewById(R.id.text_ValPess);
    }

    public void click_Calc (View button){
        double consumo, couvert, dividir, servico, total, pessoa;
        consumo = Double.parseDouble(text_ConTot.getText().toString());
        couvert = Double.parseDouble(text_CouvArt.getText().toString());
        dividir = Double.parseDouble(text_DivConta.getText().toString());

        servico = consumo * 0.10;
        total = consumo + couvert + servico;
        pessoa = total / dividir;

        text_TaxServ.setText(String.valueOf(servico));
        text_ValTot.setText(String.valueOf(total));
        text_ValPess.setText(String.valueOf(pessoa));

    }

    public void close (View button){
        finish();
    }
}