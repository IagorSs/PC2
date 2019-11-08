package questao1;

public final class Quadrado extends FormaBidimensional{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }
    
    @Override
    public double obterArea(){
        return lado*lado;
    }
}
