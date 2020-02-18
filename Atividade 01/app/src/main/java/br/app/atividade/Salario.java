package br.app.atividade;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Salario extends Activity {

    private RadioButton radio_40;
    private RadioButton radio_45;
    private RadioButton radio_50;
    private EditText text_Sal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salario);

        text_Sal = (EditText) findViewById(R.id.text_Sal);
        radio_40 = (RadioButton) findViewById(R.id.radio_40);
        radio_45 = (RadioButton) findViewById(R.id.radio_45);
        radio_50 = (RadioButton) findViewById(R.id.radio_50);
    }

    public void click_Exibir (View button){
        double salario ;
        Context contexto  = getApplicationContext();
        salario = Double.parseDouble(text_Sal.getText().toString());

        if(radio_40.isChecked()){
            salario = salario * 1.40;
            Toast.makeText(contexto, "Novo Salário: R$" + salario, Toast.LENGTH_SHORT).show();
        }else if(radio_45.isChecked()){
            salario = salario * 1.45;
            Toast.makeText(contexto, "Novo Salário: R$" + salario, Toast.LENGTH_SHORT).show();
        }else {
            salario = salario * 1.50;
            Toast.makeText(contexto, "Novo Salário: R$" + salario, Toast.LENGTH_SHORT).show();
        }
    }

    public void close (View button){
        finish();
    }
}