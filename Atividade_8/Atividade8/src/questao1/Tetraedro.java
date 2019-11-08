package questao1;

final public class Tetraedro extends FormaTridimensional{
    private double lado;

    public Tetraedro(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double obterArea(){
        return Math.pow(this.lado, 2)*Math.sqrt(3);
    }
    
    @Override
    public double obterVolume(){
        return Math.pow(this.lado, 3)*Math.sqrt(2)/12;
    }
    
}
