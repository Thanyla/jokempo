package com.example.teste;

import java.io.Serializable;

public class Player implements Serializable {
    private String nome;
    private int idEscolha;

    public Player(String nome, int idEscolha){
        this.nome = nome;
        this.idEscolha = idEscolha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEscolha() {
        return idEscolha;
    }

    public void setIdEscolha(int idEscolha) {
        this.idEscolha = idEscolha;
    }
}
