public class Cardapio {
    private Dia[] semana;

    public Cardapio(Dia[] semana) {
        this.semana= semana;
    }

    public Dia[] getSemana() {
        return semana;
    }

    public void setSemana(Dia[] semana) {
        this.semana = semana;
    }
    
    public String listarCardapio(){
        String cardapio = "";
        int i;
        for(i=0;i<this.getSemana().length;i++){
            switch (i){
                case 0:
                    cardapio += "\n         Domingo\n"+this.getSemana()[i].listarRefeicoes();
                    break;
                case 1:
                    cardapio += "\n         Segunda-feira\n"+this.getSemana()[i].listarRefeicoes();
                    break;
                case 2:
                    cardapio += "\n         Terça-feira\n"+this.getSemana()[i].listarRefeicoes();
                    break;
                case 3:
                    cardapio += "\n         Quarta-feira\n"+this.getSemana()[i].listarRefeicoes();
                    break;
                case 4:
                    cardapio += "\n         Quinta-feira\n"+this.getSemana()[i].listarRefeicoes();
                    break;
                case 5:
                    cardapio += "\n         Sexta-feira\n"+this.getSemana()[i].listarRefeicoes();
                    break;
                case 6:
                    cardapio += "\n         Sábado-feira\n"+this.getSemana()[i].listarRefeicoes();
                    break;
            }
        } return cardapio;
    }
    
    public double getCaloriasSemanais(){
        double caloriasSemanais = 0;
        int i;
        for(i=0;i<this.getSemana().length;i++)
            caloriasSemanais += this.getSemana()[i].getCaloriasDia();
        return caloriasSemanais;
    }
}
