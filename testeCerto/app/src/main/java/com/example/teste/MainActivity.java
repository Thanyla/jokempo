package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button pedraButton;
    Button papelButton;
    Button tesouraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pedraButton = findViewById(R.id.pedra);
        papelButton = findViewById(R.id.papel);
        tesouraButton = findViewById(R.id.tesoura);

        Toast.makeText(getContext(), "Escolha computada", Toast.LENGTH_SHORT).show();
    }

    public void escolha(View view) {
        startActivity(new Intent(getContext(), VerificadorActivity.class));
        
    }

    public Context getContext(){return this;}
}
