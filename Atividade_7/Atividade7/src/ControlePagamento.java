import java.util.ArrayList;
import java.util.Iterator;

public class ControlePagamento {
    
    public static final double SALARIO = 954.0;
    public static final double HORA = 8.0;
    private ArrayList<Pagavel> pagamentos;

    public ControlePagamento(ArrayList<Pagavel> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public ControlePagamento() {
        this.pagamentos = new ArrayList<>();
    }
    
    
    public boolean adicionaPagavel(Pagavel pagamento){
        //caso tente adicionar um empregado que já esteja na lista de pagamentos não permite
        if(this.pagamentos.contains(pagamento))
            return false;
        this.pagamentos.add(pagamento);
        return true;
    }
    
    public boolean demiteEmpregado(Empregado empregado){
            return this.pagamentos.remove(empregado);
    }
        
    public String imprimePagamentos(){
        String auxReturn="\n\n      Sem Pagamentos!\n\n";
        Iterator<Pagavel> it = this.pagamentos.iterator();
        if(it.hasNext()){
            auxReturn = "\n";
            auxReturn+= this.imprimeEmpregados();
            auxReturn+= this.imprimeContas();
            auxReturn+="\n\nTotal          R$"+(this.totalGasto()[0]+this.totalGasto()[1])+"\n";
        }
        return auxReturn;
    }
    
    public String imprimeEmpregados(){
        String auxReturn="\n\n      Sem empregados para pagar!\n\n";
        Iterator<Pagavel> it = this.pagamentos.iterator();
        Pagavel auxPagamento;
        int aux=0;
        while(it.hasNext()){
            auxPagamento=it.next();
            if(auxPagamento instanceof Empregado && aux==0){
                auxReturn = "\n";
                aux++;
            }
            if(auxPagamento instanceof Empregado)
                auxReturn+=((Empregado) auxPagamento).getNome()+" "+((Empregado)auxPagamento).getSobrenome()
                            +"              R$"+auxPagamento.getValorAPagar()+"\n";
        }
        if(auxReturn.equals("\n\n      Sem empregados para pagar!\n\n"));
        else
            auxReturn+= "\n\nTotal          R$"+this.totalGasto()[0]+"\n";
        return auxReturn;
    }
    
    public String imprimeContas(){
        String auxReturn="\n\n      Sem Contas para pagar!\n\n";
        Iterator<Pagavel> it = this.pagamentos.iterator();
        Pagavel auxPagamento;
        int aux=0;
        while(it.hasNext()){
            auxPagamento = it.next();
            if(auxPagamento instanceof Conta && aux==0){
                auxReturn = "\n";
                aux++;
            }if(auxPagamento instanceof Conta)
                auxReturn+="Conta           R$"+auxPagamento.getValorAPagar()+"\n";
        }
        if(auxReturn.equals("\n\n      Sem Contas para pagar!\n\n"));
        else
            auxReturn+= "\n\nTotal          R$"+this.totalGasto()[1]+"\n";
        return auxReturn;
    }
    
    public double[] totalGasto(){ 
        //[0] armazena total pago para empregados
        //[1] armazena total pago para contas
        Iterator<Pagavel> it = this.pagamentos.iterator();
        Pagavel auxPagamento;
        double []soma= new double [2];
        soma[0]=0;
        soma[1]=0;
        while(it.hasNext()){
            auxPagamento = it.next();
            if(auxPagamento instanceof Empregado)
                soma[0]+= auxPagamento.getValorAPagar();
            else if(auxPagamento instanceof Conta)
                soma[1]+= auxPagamento.getValorAPagar();
        }
        return soma;
    }
}
