
public abstract class Empregado implements Pagavel{
    protected String  nome;
    protected String sobrenome;
    protected int numIdent;
    protected int horasTrabalhadas;

    public Empregado(String nome, String sobrenome, int numIdent) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
        this.horasTrabalhadas = 0;
    }

    public Empregado(String nome, String sobrenome, int numIdent, int horasTrabalhadas) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(int numIdent) {
        this.numIdent = numIdent;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void acrescentaHora(){
        this.horasTrabalhadas++;
    }
    
    public void acrescentaHora(double horas){
        this.horasTrabalhadas+=horas;
    }
    
}
