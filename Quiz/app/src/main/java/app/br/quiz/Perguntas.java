package app.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Perguntas extends AppCompatActivity {

    //Criação das variáveis
    private RadioGroup radG;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4;
    private ImageView img;
    private Button btnResp;
    private TextView txtScore;

    int score = 0;
    int posicao = 0;
    String nome;

    //Criação do vetor que armazena as bandeiras (Imagens)
    private int bandeiras[] = {
            R.drawable.angola,
            R.drawable.argentina,
            R.drawable.brazil,
            R.drawable.canada,
            R.drawable.chile,
            R.drawable.france,
            R.drawable.italy,
            R.drawable.south_africa,
            R.drawable.turkey,
            R.drawable.uruguay
    };

    //Criação dos vetores que armazenarão as perguntas e respostas certas
    private String alternativas[][] = {
    //      {"Argélia","Angola","Líbia","Sérvia"},
            {"Alemanha","Espanha","Argentina","Haiti"},
            {"Portugal","Estados Unidos","México","Brasil"},
            {"Canada","Bolívia","Itália","França"},
            {"Colômbia","Equador","Chile","Costa do Marfim"},
            {"Rússia","Costa Rica","França","Argélia"},
            {"Itália","Suíça","Paraguai","Bélgica"},
            {"Jamaica","Africa do Sul","Índia","Nigéria"},
            {"Noruega","Síria","Turquia","Líbia"},
            {"Uruguai","Polônia","Líbano","Catar"}
    };

    private String respCorreta[] = {
            "Angola", "Argentina", "Brasil", "Canada", "Chile", "França", "Itália", "Africa do Sul", "Turquia", "Uruguai"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perguntas);

        //Pegando e armazenando valor passado da outra classe para a variável nome
        Intent it = getIntent();
        nome = it.getStringExtra("ArmNome");

        //Passando referência dos componentes do layout para as variáveis.
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton) findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton) findViewById(R.id.rbtn3);
        rbtn4 = (RadioButton) findViewById(R.id.rbtn4);
        txtScore = (TextView) findViewById(R.id.txtScore);

        img = (ImageView) findViewById(R.id.img);
        btnResp = (Button) findViewById(R.id.btnResp);

        //Método "isChecked" do RadioGroup
        radG = (RadioGroup) findViewById(R.id.radG);
        radG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId)
                {
                    case R.id.rbtn1:
                        btnResp.setEnabled(true);
                        break;

                    case R.id.rbtn2:
                        btnResp.setEnabled(true);
                        break;

                    case R.id.rbtn3:
                        btnResp.setEnabled(true);
                        break;

                   case R.id.rbtn4:
                        btnResp.setEnabled(true);
                        break;
                }
            }
        });
    }

    //Métodos dos botões
    public void responder (View botao) {
        if (posicao == 9) {
            atribuicaoScore();

            //Armazenando valores que serão passados para a proxima classe
            Intent it = new Intent(this, Ranking.class);
            it.putExtra("ArmScore", Integer.toString(score));
            it.putExtra("ArmNome", nome);

            startActivity(it);
            finish();

        } else {
            atribuicaoScore();

            rbtn1.setText(alternativas[posicao][0]);
            rbtn2.setText(alternativas[posicao][1]);
            rbtn3.setText(alternativas[posicao][2]);
            rbtn4.setText(alternativas[posicao][3]);

            posicao++;

            //Comando para troca de imagem
            img.setImageResource(bandeiras[posicao]);
        }
    }

    //Método para verificar a resposta crreta e atribuir pontuação
    public void atribuicaoScore() {
        if (rbtn1.isChecked())
            if (rbtn1.getText().equals(respCorreta[posicao])) {
                score++;
                txtScore.setText("Score: " + score);
            }

        if (rbtn2.isChecked())
            if (rbtn2.getText().equals(respCorreta[posicao])) {
                score++;
                txtScore.setText("Score: " + score);
            }

        if (rbtn3.isChecked())
            if (rbtn3.getText().equals(respCorreta[posicao])) {
                score++;
                txtScore.setText("Score: " + score);
            }

        if (rbtn4.isChecked())
            if (rbtn4.getText().equals(respCorreta[posicao])) {
                score++;
                txtScore.setText("Score: " + score);
            }
    }
}
