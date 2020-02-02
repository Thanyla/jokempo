package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
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

        Toast.makeText(getContext(), rules.quemVence(playerOne, playerTwo).getNome(), Toast.LENGTH_SHORT).show();
    }
    public Context getContext(){return this;}

}
