package atividade6;

import java.security.SecureRandom;
import java.util.ArrayList;
        
public class Baralho {
    private Carta[] baralho = new Carta[52]; // vetor de 52 cartas

    public Carta[] getBaralho() {
        return baralho;
    }

    public void setBaralho(Carta[] baralho) {
        this.baralho = baralho;
    }

    public Baralho() {
        String[] naipes = {"Copas","Ouros","Paus","Espadas"};
        int i=0, auxNaipes;
        for(auxNaipes=0;auxNaipes<naipes.length;auxNaipes++)
            for(;i<13*(auxNaipes+1);i++)
                baralho[i] = new Carta(naipes[auxNaipes],(i%13)+1);
    }
    
    public void embaralhar(){
        SecureRandom gerador = new SecureRandom();
        int embaralhador, auxInteiro1, auxInteiro2;
        Carta auxCarta1, auxCarta2;
        for(embaralhador=0; embaralhador<500; embaralhador++){
            auxInteiro1 = gerador.nextInt(baralho.length);
            auxCarta1 = baralho[auxInteiro1];
            auxInteiro2 = gerador.nextInt(baralho.length);
            auxCarta2 = baralho[auxInteiro2];
            baralho[auxInteiro1] = auxCarta2;
            baralho[auxInteiro2] = auxCarta1;
        }
    }
    
    public ArrayList <Carta> separarCartas(int qtdeCartas){
        int i, auxQtde = qtdeCartas;
        ArrayList <Carta> cartas = new ArrayList();
        for(i=0;i<qtdeCartas;i++){
            if(i>=52)
                return null;
            if(this.baralho[i]==null)
                qtdeCartas++;
            else
                cartas.add(this.baralho[i]);
        }for(i=0;i<cartas.size();i++)
            this.removeCarta(cartas.get(i));
        return cartas;
    }
    
    public void removeCarta(Carta carta){
        int i;
        for(i=0;i<baralho.length;i++)
            if(baralho[i]==carta)
                this.baralho[i]=null;
    }
    
    public void remontarBaralho(){
        String[] naipes = {"Copas","Ouros","Paus","Espadas"};
        int i=0, auxNaipes;
        for(auxNaipes=0;auxNaipes<naipes.length;auxNaipes++)
            for(;i<13*(auxNaipes+1);i++){
                if(baralho[i]==null)
                    baralho[i] = new Carta(naipes[auxNaipes],(i%13)+1);
                else{
                    baralho[i].setNaipe(naipes[auxNaipes]);
                    baralho[i].setValor((i%13)+1);
                }
            }
        this.embaralhar();
    }
}
