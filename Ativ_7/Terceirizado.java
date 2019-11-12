
public class Terceirizado extends Empregado{
    
    public Terceirizado(String nome, String sobrenome, int numIdent,int horasTrabalhadas) {
        super(nome, sobrenome, numIdent, horasTrabalhadas);
    }
    
    @Override
    public double getValorAPagar(){
        double salario;
        salario = this.horasTrabalhadas*ControlePagamento.HORA;
        return salario;
    }
}
