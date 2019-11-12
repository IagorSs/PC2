
public class Assalariado extends Empregado{

    public Assalariado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }
    
    public Assalariado(String nome, String sobrenome, int numIdent, int horasTrabalhadas){
        super(nome,sobrenome,numIdent,horasTrabalhadas);
    }
    
    @Override
    public double getValorAPagar(){
        double salario = ControlePagamento.SALARIO;
        if(super.horasTrabalhadas>40)
            salario += (super.horasTrabalhadas-40)*ControlePagamento.HORA;
        return salario;
    }
}
