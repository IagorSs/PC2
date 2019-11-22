package Modelo;

import java.util.Observable;
import java.util.Random;

public class JogoDez extends Observable{
    private int passosDados;
    private int limiteBombas;
    private int tamanhoTabuleiro[];
    private int tabuleiro[][];
    
    public JogoDez(int largura, int altura){
        this.tamanhoTabuleiro = new int[3];
        setTamanhoTabuleiro(largura,altura);
        this.tabuleiro = new int[largura][altura];
        iniciaTabuleiro();
    }
    
    private void setTamanhoTabuleiro(int largura, int altura){
        this.tamanhoTabuleiro[0] = largura*altura;
        this.tamanhoTabuleiro[1] = largura;
        this.tamanhoTabuleiro[2] = altura;
        atualizaLimiteBombas();
    }
    
    private void atualizaLimiteBombas(){
        this.limiteBombas = this.tamanhoTabuleiro[0] - 10;
    }
    
    private void iniciaTabuleiro(){
        Random random = new Random();
        int bomba, contadoresBomba = 0;
        for(int i=0; i<this.tamanhoTabuleiro[2]; i++){
            for(int j=0; j<this.tamanhoTabuleiro[1]; j++){
                if(contadoresBomba == this.limiteBombas)
                    bomba = 0;
                else
                    bomba = random.nextInt(2);
                this.tabuleiro[i][j] = bomba;
                if(bomba == 1)
                    contadoresBomba++;
            }
        }
    }
    
    //Retorna true se explodir uma bomba
    public boolean testaClick(int posicao[]){
        if(this.tabuleiro[posicao[0]][posicao[1]] == 1)
            return true;
        return false;
    }
    
    public void atualizaTabuleiro(int posicao[]){
        if(testaClick(posicao))
            //explode bomba
        else
            //toca o jogo
        notifyObservers();
    }
}
