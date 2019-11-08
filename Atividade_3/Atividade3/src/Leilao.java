public class Leilao {
    private Lote[] leilao;

    public Lote[] getLeilao() {
        return leilao;
    }

    public void setLeilao(Lote[] leilao) {
        this.leilao = leilao;
    }

    public Leilao(Lote[] leilao) {
        this.leilao = leilao;
    }
    
    public boolean adicionaLote(Lote lote){
        int i;
        for(i=0;i<this.leilao.length;i++){
            if(this.leilao[i]==null){
                this.leilao[i]=lote;
                return true; //adicionou lote com sucesso
            }
        }return false; //falhou em adicionar lote
    }
    
    public boolean recebeLance(Lance lance, String descricao){
        int i;
        double antigoMaior;
        for(i=0;i<this.leilao.length;i++){
            if(leilao[i].getDescricao().equals(descricao)){
                if(leilao[i].getMaiorLance()!=null)
                    antigoMaior=leilao[i].getMaiorLance().getValor();
                else
                    antigoMaior=0;
                leilao[i].verificaLance(lance);
                if(leilao[i].getMaiorLance().getValor()>antigoMaior){
                    return true; //encontrou descrição e o lance dado era maior do que o anterior
                }
            }
        }return false;//não encontrou descrição ou lance foi menor
    }
    
    public String imprimeLotes(){
        int i;
        String lotesImpressos;
        lotesImpressos="   Lotes do leilão\n\n";
        for(i=0;i<leilao.length;i++){
            if(leilao[i]!=null){
                if(leilao[i].getMaiorLance()==null){
                    lotesImpressos = lotesImpressos+(i+1)+"º Lote\n"+leilao[i].getDescricao()+"\n"+"Nenhum lance neste lote\n";
                }else{
                    lotesImpressos = lotesImpressos+(i+1)+"º Lote\n"+leilao[i].getDescricao()+"\n"+"Maior lance:"+leilao[i].getMaiorLance().getPessoa1().getNome()+"\nValor: R$"+leilao[i].getMaiorLance().getValor()+"\n";
                }
            }
        }return lotesImpressos;
    }
    
    public String encerraLeilao(){
        String resultadoLeilao;
        resultadoLeilao="       \nLeilao encerrado\n\n"+ this.imprimeLotes();
        return resultadoLeilao;
    }
}