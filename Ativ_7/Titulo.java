
public class Titulo extends Conta{

    public Titulo(int dia, int mes, double valor,int diaPgmt, int mesPgmt) {
        super(dia, mes, valor, diaPgmt, mesPgmt);
    }

    public Titulo(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }
    
    @Override
    public double getValorAPagar(){
        if(this.mesPgmt<=super.mes && this.diaPgmt<=super.dia)
            return super.valor;
        return super.valor*1.1;
    }
}
