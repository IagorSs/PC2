public class Relogio {
        
    private int formatoRelogio; //24 pra 24 hrs e 12 para 12 hrs
    
    public Relogio(int formatoRelogio) {
        this.formatoRelogio = formatoRelogio;        
    }
    
    private Contador minutos = new Contador();
    private Contador horas = new Contador();

    public Contador getMinutos() {
        return minutos;
    }

    public void setMinutos(Contador minutos) {
        this.minutos = minutos;
    }

    public Contador getHoras() {
        return horas;
    }

    public void setHoras(Contador horas) {
        this.horas = horas;
    }
    
    public int getFormatoRelogio() {
        return formatoRelogio;
    }

    public void setFormatoRelogio(int formatoRelogio) {
        this.formatoRelogio = formatoRelogio;
    }
        
    public void TicTac(){
        minutos.incrementar(60);
        if(minutos.getNumeroAtual()==0){
            horas.incrementar(24);
        }
    }
    
    public String exibirHoras(){
        String retorno;
        if(formatoRelogio==12){
            if(horas.getNumeroAtual()>12){
                retorno = (horas.getNumeroAtual()%12)+":"+minutos.getNumeroAtual()+" p.m.";
            }else if(horas.getNumeroAtual()==12){
                retorno = horas.getNumeroAtual()+":"+minutos.getNumeroAtual()+" p.m.";
            }else{
                retorno = horas.getNumeroAtual()+":"+minutos.getNumeroAtual()+" a.m.";
            }
        }else{
            retorno = horas.getNumeroAtual()+":"+minutos.getNumeroAtual();
        }return retorno;
    }

}
