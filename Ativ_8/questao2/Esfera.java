package questao2;

final public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio) {
        super();
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        return 4*Math.PI*Math.pow(raio, 2);
    }
    
    @Override
    public double obterVolume(){
        return 4*Math.PI*Math.pow(raio, 3)/3;
    }
    
}
