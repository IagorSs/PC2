package questao1;

public final class Triangulo extends FormaBidimensional{
    private double []lado;

    public Triangulo(double lado1,double lado2, double lado3) {
        super();
        this.lado = new double[3];
        this.lado[0] = lado1;
        this.lado[1] = lado2;
        this.lado[2] = lado3;
    }

    public double[] getLado() {
        return lado;
    }

    public void setLado(double[] lado) {
        this.lado = lado;
    }
    
    private double calculaPerimetro(){
        double perimetro=0;
        for(int i=0; i< this.lado.length; i++)
            perimetro+= this.lado[i];
        return perimetro;
    }
    
    @Override
    public double obterArea(){
        double Area;
        double semiPerimetro;
        semiPerimetro = this.calculaPerimetro()/2;
        Area = Math.sqrt(semiPerimetro*(semiPerimetro-this.lado[0])*(semiPerimetro-this.lado[1])*(semiPerimetro-this.lado[2]));
        return Area;
    }
    
}
