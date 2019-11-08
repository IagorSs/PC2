
public class Concessionaria extends Conta{

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }    

    public Concessionaria(int dia, int mes, double valor, int diaPgmt, int mesPgmt) {
        super(dia, mes, valor, diaPgmt, mesPgmt);
    }
    
    @Override
    public double getValorAPagar(){
        return super.valor;
    }
}
