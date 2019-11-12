package questao2;

final public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado) {
        super();
        this.lado = lado;
    }
    
    @Override
    public double obterArea(){
        return 6*Math.pow(lado, 2);
    }
    
    @Override
    public double obterVolume(){
        return Math.pow(lado, 3);        
    }
}
