package com.example.teste;

public class Chooses {
    public int getImagem(int idEscolha){
        if(idEscolha == R.id.papel){
            return getPapel();
        }
        if(idEscolha == R.id.pedra){
            return getPedra();
        }
        if(idEscolha == R.id.tesoura){
            return getTesoura();
        }
        return 0;
    }

    public int getPedra(){
        return R.drawable.ic_stone;
    }

    public int getPapel(){
        return R.drawable.ic_document;
    }

    public int getTesoura(){
        return R.drawable.ic_scissors;
    }
}
