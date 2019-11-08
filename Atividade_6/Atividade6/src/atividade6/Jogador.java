package atividade6;

import java.util.ArrayList;
import java.util.Iterator;

public class Jogador {
    
    private String nome;
    private ArrayList <Carta> cartas;

    public Jogador(String nome) {
        this.nome = nome;
        this.cartas = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void recebeTodasCartas(ArrayList <Carta> cartas){
        this.cartas = cartas;
    }
    
    public void adicionaCarta(Carta carta){
        this.cartas.add(carta);
    }
    
    public Carta identificaMaiorCarta (){
        Iterator <Carta> it = this.cartas.iterator();
        Carta auxMaior = it.next();
        Carta auxIt;
        while(it.hasNext()){
            auxIt = it.next();
            if(auxMaior.comparaCarta(auxIt)==null);
            else
                auxMaior = auxMaior.comparaCarta(auxIt);
        }
        return auxMaior;
    }
}
