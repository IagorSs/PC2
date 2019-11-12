package atividade6;

public class Carta {
    
    private String naipe;
    private int valor;

    public Carta(String naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Carta comparaCarta(Carta carta){
        if(carta.getValor() > this.valor)
            return carta;
        else if(carta.getValor()==this.valor){
            if(carta.getNaipe().equals("Ouros"))
                return carta;
            else if(this.getNaipe().equals("Ouros"))
                return this;
            else
                return null;
        }else
            return this;
    }
}
