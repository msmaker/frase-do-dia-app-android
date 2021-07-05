package com.msmaker.alinhamento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        Random numero = new Random();
        String[] frases = {
                "A persistência é o caminho do êxito.",
                "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
                "Só existe um êxito: a capacidade de levar a vida que se quer.",
                "A coragem não é ausência do medo; é a persistência apesar do medo.",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos."
        };

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero.nextInt(5)]);

    }
}
