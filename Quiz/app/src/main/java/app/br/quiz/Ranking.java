package app.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ranking extends AppCompatActivity {

    //Criando variáveis
    private TextView lblNome, lblPontos;
    private Button btnRespNov, btnTelaPrinc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking);

        //Passando referência dos componentes do layout para as variáveis.
        lblNome = (TextView) findViewById(R.id.lblNome);
        lblPontos = (TextView) findViewById(R.id.lblPontos);
        btnRespNov = (Button) findViewById(R.id.btnRespNov);
        btnTelaPrinc = (Button) findViewById(R.id.btnTelaPrinc);

        Intent it = getIntent();
        //Armazenando os valores passados da outra classe em variáveis
        String score = it.getStringExtra("ArmScore");
        String nome = it.getStringExtra("ArmNome");

        lblPontos.setText(score + " / 10");
        lblNome.setText(nome);
    }

    //Método dos botões
    public void respNov (View botao) {
        Intent it = new Intent(this, Perguntas.class);
        startActivity(it);
        finish();
    }

    public void telaPrinc(View botao) {
        Intent it = new Intent(this, Inicio.class);
        startActivity(it);
        finish();
    }
}
