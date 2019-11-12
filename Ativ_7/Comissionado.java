
public class Comissionado extends Empregado{
    protected double vendas;

    public Comissionado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.vendas=0;
    }

    public Comissionado(String nome, String sobrenome, int numIdent,double vendas) {
        super(nome, sobrenome, numIdent);
        this.vendas = vendas;
    }

    public Comissionado(String nome, String sobrenome, int numIdent, int horasTrabalhadas, double vendas) {
        super(nome, sobrenome, numIdent, horasTrabalhadas);
        this.vendas = vendas;
    }
    
    @Override
    public double getValorAPagar(){
        double salario;
        salario = (6/100.0)*this.vendas;
        return salario;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    
    public void acrescentaVenda(double venda){
        this.vendas+=venda;
    }
}
