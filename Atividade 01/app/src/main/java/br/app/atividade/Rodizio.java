package br.app.atividade;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class Rodizio extends Activity {

    private EditText text_Let;
    private EditText text_Num;
    private EditText text_Fim;
    private EditText text_Semana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rodizio);

        text_Let = (EditText) findViewById(R.id.text_Let);
        text_Num = (EditText) findViewById(R.id.text_Num);
        text_Fim = (EditText) findViewById(R.id.text_Fim);
        text_Semana = (EditText) findViewById(R.id.text_Semana);
    }

    public void click_Verific (View button){
        String dia;
        int numeros, digito ;
        String n;

        n = Integer.toString(Integer.parseInt(text_Num.getText().toString()));
        String substr = n.substring(3,4);
        numeros = Integer.parseInt(n.substring(3,4).toString());

        if((numeros == 1) || (numeros == 2)){
            dia = "Segunda";
            text_Fim.setText(String.valueOf(numeros));
            text_Semana.setText(String.valueOf(dia));
        }else if(numeros == 3 || numeros == 4){
            dia = "Terça";
            text_Fim.setText(String.valueOf(numeros));
            text_Semana.setText(String.valueOf(dia));
        }else if(numeros == 5 || numeros == 6){
            dia = "Quarta";
            text_Fim.setText(String.valueOf(numeros));
            text_Semana.setText(String.valueOf(dia));
        }else if(numeros == 7 || numeros == 8){
            dia = "Quinta";
            text_Fim.setText(String.valueOf(numeros));
            text_Semana.setText(String.valueOf(dia));
        }else{
            dia = "Sexta";
            text_Fim.setText(String.valueOf(numeros));
            text_Semana.setText(String.valueOf(dia));
        }
    }

    public void close (View button){
        finish();
    }
}
