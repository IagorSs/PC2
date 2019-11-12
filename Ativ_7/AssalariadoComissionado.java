
public class AssalariadoComissionado extends Comissionado{

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent,double vendas) {
        super(nome, sobrenome, numIdent,vendas);
    }

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, int horasTrabalhadas, double vendas) {
        super(nome, sobrenome, numIdent, horasTrabalhadas, vendas);
    }    
    
    @Override
    public double getValorAPagar(){
        double salario;
        salario = super.getValorAPagar() + ControlePagamento.SALARIO*1.1;
        return salario;
    }
    
}
