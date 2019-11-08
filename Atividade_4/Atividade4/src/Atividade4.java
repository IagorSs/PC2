public class Atividade4 {
    public static void main(String[] args) {
        
        //instanciando objetos
        Refeicao a = new Refeicao("Maçã", 10);
        Refeicao b = new Refeicao("McDonalds", 800);
        Refeicao c = new Refeicao("Dogão do tio", 1500);
        Refeicao d = new Refeicao("Almoço totalmente normal", 300);
        Refeicao e = new Refeicao("Bandejão do CEFET", 250);
        Refeicao f = new Refeicao("Salada de frutas", 50);
        Refeicao g = new Refeicao("Bacon com torresmo", 2000);
        Refeicao h = new Refeicao("Pizza", 1300);
        Refeicao i = new Refeicao("Montanha de arroz com feijão", 600);
        Refeicao j = new Refeicao("Chá de hortelã", 250);
        
        Dia segundafeira = new Dia();
        Dia terçafeira = new Dia();
        Dia quartafeira = new Dia();
        Dia quintafeira = new Dia();
        Dia sextafeira = new Dia();
        Dia sabado = new Dia();
        Dia domingo = new Dia();
        Dia []semana = new Dia [7];
        
        semana[1] = segundafeira;
        semana[2] = terçafeira;
        semana[3] = quartafeira;
        semana[4] = quintafeira;
        semana[5] = sextafeira;
        semana[6] = sabado;
        semana[0] = domingo;
        
        //testando funções
        semana[0].inserirRefeicao(a,2);
        semana[1].inserirRefeicao(a);
        
        if(semana[1].inserirRefeicao(b, 5)==true)
            System.out.println("\nRefeição inserida com sucesso!");
        else
            System.out.println("\nRefeição não foi inserida!");
        
        if(semana[1].excluirRefeicao(a)==true)
            System.out.println("\nRefeição excluída com sucesso!");
        else
            System.out.println("\nRefeição não foi inserida!");
        
        if(semana[1].excluirRefeicao(j, 2)==true)
            System.out.println("\nRefeição excluída com sucesso!");
        else
            System.out.println("\nRefeição não encontrada!");
        
        System.out.printf("%s", semana[1].listarRefeicoes());
        semana[2].inserirRefeicao(b,4);
        semana[1].substituirRefeicao(c, 5);
        semana[3].inserirRefeicao(d, 3);
        
        semana[4].inserirRefeicao(a);
        semana[4].inserirRefeicao(b);
        semana[4].inserirRefeicao(c);
        semana[4].inserirRefeicao(d);
        semana[4].inserirRefeicao(e);
        
        if(semana[4].inserirRefeicao(f)==true)
            System.out.println("\nRefeição inserida com sucesso!");
        else
            System.out.println("\nRefeição não foi inserida!");
        
        if(semana[4].inserirRefeicao(g)==true)
            System.out.println("\nRefeição inserida com sucesso!");
        else
            System.out.println("\nRefeição não foi inserida!");
        
        semana[5].inserirRefeicao(h, 5);
        semana[5].inserirRefeicao(i, 2);
        semana[5].inserirRefeicao(j, 0);
        
        Cardapio cardapio = new Cardapio(semana);
        System.out.printf("%s", cardapio.listarCardapio());
        int aux;
        for(aux=0;aux<cardapio.getSemana().length;aux++)
            System.out.printf("\n Calorias do %d dia: %.0f kcal", (aux+1),cardapio.getSemana()[aux].getCaloriasDia());
        System.out.printf("\nCalorias semanais %.0f kcal\n", cardapio.getCaloriasSemanais());
        
        
    }    
}
