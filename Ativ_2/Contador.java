public class Contador {
    private int numeroAtual;

    public Contador() {
        this.numeroAtual = 0;
    }
    
    public Contador(int numeroDesejado){
        this.numeroAtual = numeroDesejado;
    }

    public int getNumeroAtual() {
        return numeroAtual;
    }

    public void setNumeroAtual(int numeroAtual) {
        this.numeroAtual = numeroAtual;
    }
    
    public void incrementar(int limite){
        this.numeroAtual++;
        if(this.numeroAtual == limite){
            this.numeroAtual=0;
        }
    }
}
