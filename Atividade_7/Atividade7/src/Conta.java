
public abstract class Conta implements Pagavel{
    protected int dia;
    protected int mes;
    protected double valor;
    protected int diaPgmt;
    protected int mesPgmt;

    public Conta(int dia, int mes, double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

    public Conta(int dia, int mes, double valor, int diaPgmt, int mesPgmt) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
        this.diaPgmt = diaPgmt;
        this.mesPgmt = mesPgmt;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void pagarConta(int dia,int mes){
        this.diaPgmt=dia;
        this.mesPgmt=mes;
    }
    
}
