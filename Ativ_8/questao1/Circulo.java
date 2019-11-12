package questao1;

final public class Circulo extends FormaBidimensional{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        return Math.PI*Math.pow(raio,2);
    }
}
