package br.app.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela02 extends AppCompatActivity {

    private ImageView imgMeme;

    int pos = 0;

    int imagens[] = {
        R.drawable.meme01,
        R.drawable.meme02,
        R.drawable.meme03,
        R.drawable.meme04,
        R.drawable.meme05,
        R.drawable.meme06,
        R.drawable.meme07,
        R.drawable.meme08,
        R.drawable.meme09,
        R.drawable.meme10,
        R.drawable.meme11,
        R.drawable.meme12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela02);

        imgMeme = (ImageView) findViewById(R.id.imgMeme);
    }

    public void voltar(View botao) {
        if (pos > 0) pos--;
        imgMeme.setImageResource(imagens[pos]);

    }

    public void avancar(View botao) {
        if (pos < 11) pos++;
        imgMeme.setImageResource(imagens[pos]);

    }
}
