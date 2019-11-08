public class Lance {
    private Pessoa pessoa1;
    private double valor;

    public Lance(Pessoa pessoa1, double valor) {
        this.pessoa1 = pessoa1;
        this.valor = valor;
    }

    public Pessoa getPessoa1() {
        return pessoa1;
    }

    public void setPessoa1(Pessoa pessoa1) {
        this.pessoa1 = pessoa1;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Lance comparaLance(Lance lanceConcorrente){ //vai retornar maior lance
        if(this.getValor()<lanceConcorrente.getValor())
            return lanceConcorrente;
        else
            return this;
    }
}
