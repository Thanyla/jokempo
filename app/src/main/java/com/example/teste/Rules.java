package com.example.teste;

import java.io.Serializable;

public class Rules implements Serializable {
    private int pedra = 0;
    private int papel = 0;
    private int tesoura = 0;
    private Player vencedor = null;

    public Rules(int pedra, int papel, int tesoura){
        this.pedra = pedra;
        this.papel = papel;
        this.tesoura = tesoura;
    }

    public Player quemVence(Player playerOne, Player playerTwo){

        if(playerOne.getIdEscolha() == pedra){
            if(playerTwo.getIdEscolha() == pedra){
                this.vencedor = null;
            }else if(playerTwo.getIdEscolha() == papel){
                this.vencedor = playerTwo;
            }else if(playerTwo.getIdEscolha() == tesoura){
                this.vencedor = playerOne;
            }
        }else if(playerOne.getIdEscolha() == papel){
            if(playerTwo.getIdEscolha() == pedra){
                this.vencedor = playerOne;
            }else if(playerTwo.getIdEscolha() == papel){
                this.vencedor = null;
            }else if(playerTwo.getIdEscolha() == tesoura){
                this.vencedor = playerTwo;
            }
        }else if(playerOne.getIdEscolha() == tesoura){
            if(playerTwo.getIdEscolha() == pedra){
                this.vencedor = playerTwo;
            }else if(playerTwo.getIdEscolha() == papel){
                this.vencedor = playerOne;
            }else if(playerTwo.getIdEscolha() == tesoura){
                this.vencedor = null;
            }
        }

        return vencedor;
    }
}
