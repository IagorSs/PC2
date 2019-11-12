public class Refeicao {

    public Refeicao(String descricao, double valorcalorico) {
        this.descricao = descricao;
        this.valorcalorico = valorcalorico;
    }
    
    private String descricao;    
    private double valorcalorico;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorcalorico() {
        return valorcalorico;
    }

    public void setValorcalorico(double valorcalorico) {
        this.valorcalorico = valorcalorico;
    }
    
}
