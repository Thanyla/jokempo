package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Rules regras = null;
    public Player playerOne = null;
    public Player playerTwo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pedraButton = findViewById(R.id.pedra);
        Button papelButton = findViewById(R.id.papel);
        Button tesouraButton = findViewById(R.id.tesoura);

        regras = new Rules(pedraButton.getId(), papelButton.getId(), tesouraButton.getId());

        this.playerOne = null;
        this.playerTwo = null;
        TextView playerText = (TextView) findViewById(R.id.textPlayer);
        playerText.setText(R.string.player_one);
    }

    public void escolha(View view) {
        //preenchendo jogadores
        if(playerOne == null){
            this.playerOne = new Player("PLAYER 1", view.getId());
            Toast.makeText(getContext(), "Escolha computada", Toast.LENGTH_SHORT).show();
            TextView playerText = (TextView) findViewById(R.id.textPlayer);
            playerText.setText(R.string.player_two);

        }else if(playerTwo == null){
            this.playerTwo = new Player("PLAYER 2", view.getId());
            Toast.makeText(getContext(), "Escolha computada", Toast.LENGTH_SHORT).show();
        }

        if(playerOne != null && playerTwo != null){
            Intent intent = new Intent(getContext(), ControlActivity.class);
            intent.putExtra("playerOne", playerOne);
            intent.putExtra("playerTwo", playerTwo);
            intent.putExtra("rules", regras);
            startActivity(intent);
            //Toast.makeText(getContext(), regras.quemVence(playerOne, playerTwo).getNome(), Toast.LENGTH_SHORT).show();

        }

        //regras.quemVence(playerOne, playerTwo);



        //startActivity(new Intent(getContext(), ControlActivity.class));
    }

    public Context getContext(){return this;}
}
