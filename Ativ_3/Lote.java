public class Lote {
    private Lance maiorLance;
    private String descricao; // nome do lote

    public Lance getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lote(String descricao) {
        this.descricao = descricao;
        this.maiorLance = null;
    }
    
    public void verificaLance(Lance lance){
        if(this.getMaiorLance()==null)
            maiorLance=lance;
        else
            maiorLance=maiorLance.comparaLance(lance);
    }
    
}
