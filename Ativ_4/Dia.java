public class Dia{
    
    private Refeicao[] refeicoes;

    public Dia() {
        this.refeicoes = new Refeicao [6];
    }

    public Refeicao[] getRefeicoes() {
        return refeicoes;
    }

    public void setRefeicoes(Refeicao[] refeicoes) {
        this.refeicoes = refeicoes;
    }
    
    public boolean inserirRefeicao(Refeicao refeicao){ // insere Refeição no primeiro momento livre do dia
        int i;
        for(i=0;i<this.getRefeicoes().length;i++){
            if(this.getRefeicoes()[i]==null){
                this.getRefeicoes()[i]=refeicao;
                return true; //conseguiu inserir Refeicao
            }
        }return false;
    }
    // insere Refeição em momento especifico do dia
    public boolean inserirRefeicao(Refeicao refeicao, int momentoDia){
        if(this.getRefeicoes()[momentoDia]==null){
            this.getRefeicoes()[momentoDia]=refeicao;
            return true; //conseguiu inserir Refeicao
        }else
            return false;
    }
    
    public boolean excluirRefeicao(Refeicao refeicao){
        int i;
        for(i=0;i<this.getRefeicoes().length;i++){
            if(this.getRefeicoes()[i]==refeicao){
                this.getRefeicoes()[i]=null;
                return true; // encontrou e excluiu refeição
            }
        }return false; // não encontrou Refeicao no Dia em questão
    }
    
    public boolean excluirRefeicao(Refeicao refeicao, int momentoDia){
        if(this.getRefeicoes()[momentoDia]==refeicao){
            this.getRefeicoes()[momentoDia]=null;
            return true; // encontrou e excluiu refeição
           }return false; // não encontrou Refeicao no Dia em questão
    }
    
    public void substituirRefeicao(Refeicao refeicao, int momentoDia){
        this.getRefeicoes()[momentoDia] = refeicao;
    }
    
    public String listarRefeicoes(){
        String refeicoesDia="\n";
        int i;
        for(i=0;i<this.getRefeicoes().length;i++){
            if(this.getRefeicoes()[i]==null);
            else{
                switch (i){
                    case 0:
                        refeicoesDia += "\nCafé da manhã: "+this.getRefeicoes()[i].getDescricao()+"\nValor calórico:"+this.getRefeicoes()[i].getValorcalorico()+" kcal";
                        break;
                    case 1:
                        refeicoesDia += "\nLanche da Manhã: "+this.getRefeicoes()[i].getDescricao()+"\nValor calórico:"+this.getRefeicoes()[i].getValorcalorico()+" kcal";
                        break;
                    case 2:
                        refeicoesDia += "\nAlmoço: "+this.getRefeicoes()[i].getDescricao()+"\nValor calórico:"+this.getRefeicoes()[i].getValorcalorico()+" kcal";
                        break;
                    case 3:
                        refeicoesDia += "\nLanche da Tarde: "+this.getRefeicoes()[i].getDescricao()+"\nValor calórico:"+this.getRefeicoes()[i].getValorcalorico()+" kcal";
                        break;
                    case 4:
                        refeicoesDia += "\nJantar: "+this.getRefeicoes()[i].getDescricao()+"\nValor calórico:"+this.getRefeicoes()[i].getValorcalorico()+" kcal";
                        break;
                    case 5:
                        refeicoesDia += "\nCeia: "+this.getRefeicoes()[i].getDescricao()+"\nValor calórico:"+this.getRefeicoes()[i].getValorcalorico()+" kcal";
                        break;
                }
            }
        } return refeicoesDia;            
    }
    
    public double getCaloriasDia(){
        double somaCalorias = 0;
        int i;
        for(i=0;i<this.getRefeicoes().length;i++){
            if(this.getRefeicoes()[i] == null);
            else
                somaCalorias += this.getRefeicoes()[i].getValorcalorico();
        }return somaCalorias;
    }
}