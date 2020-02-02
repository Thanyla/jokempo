package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        Bundle extras = getIntent().getExtras();
        Player playerOne = (Player) extras.get("playerOne");
        Player playerTwo = (Player) extras.get("playerTwo");
        Rules rules = (Rules) extras.get("rules");

        ImageView playerOneEscolha= (ImageView) findViewById(R.id.imagePlayerOne);
        ImageView playerTwoEscolha= (ImageView) findViewById(R.id.imagePlayerTwo);
        //playerOneEscolha.setImageResource(R.drawable.ic_scissors);
        playerOneEscolha.setImageResource(new Chooses().getImagem(playerOne.getIdEscolha()));
        playerTwoEscolha.setImageResource(new Chooses().getImagem(playerTwo.getIdEscolha()));

        TextView winner = (TextView) findViewById(R.id.textWinner);
        winner.setText(rules.quemVence(playerOne, playerTwo).getNome());

    }
    public Context getContext(){return this;}

}
