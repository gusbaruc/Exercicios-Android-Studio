package app.br.quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Editable;
        import android.text.TextWatcher;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    //Criação das variáveis
    private EditText txtNome;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        //Passando referência dos componentes do layout para as variáveis.
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        txtNome = (EditText) findViewById(R.id.txtNome);

        //Referenciando método TextWatcher á variável txtNome.
        txtNome.addTextChangedListener(observador);
    }

    //Método TextWatcher define ações antes, durante e depois de alterações serem feitas no componente text.
    private TextWatcher observador = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            //Criando variável para receber o valor inserido no text.
            String nomeInserido = txtNome.getText().toString();

            //Ativa o botão caso o text não estiver vazio.
            btnIniciar.setEnabled(!nomeInserido.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {}
    };

    //Métodos dos botões
    public void iniciar (View botao) {
        Intent it = new Intent(this, Perguntas.class);

        //Armazenando valor do txtNome para transferir para a outra classe
        it.putExtra("ArmNome", txtNome.getText().toString());

        startActivity(it);
    }

    public void fechar (View botao) {
        finish();
    }
}
