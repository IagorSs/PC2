//problema no programa: não estou sabendo trabalhar com vetores de objetos.


public class TesteLeilao {
    public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Gabriel Quezada");
    Pessoa pessoa2 = new Pessoa("Iagor Sousa");
    Pessoa pessoa3 = new Pessoa("Dallai Lama");
    Lote primeiroLote = new Lote("Abacate");
    Lote segundoLote = new Lote("Estátua de Ouro");
    Lote terceiroLote = new Lote("Quadro muito chato");
    Lote lotes[] = new Lote[3];
    
    //lotes para leilão testando função de adicionar lotes
    lotes[0]=primeiroLote;
    lotes[1]=segundoLote;
    Leilao leilao1 = new Leilao(lotes);
    
    if(leilao1.adicionaLote(terceiroLote)==true)
        System.out.println("Lote encaminhado para leilão");
    else
        System.out.println("Leilão cheio!");
    
    //Situação inicial do leilão
    
    System.out.print(leilao1.imprimeLotes());
    
    //lances para serem dados no leilão
    Lance lance1= new Lance(pessoa1,200);
    Lance lance2= new Lance(pessoa1,500);
    Lance lance3= new Lance(pessoa2,500);
    Lance lance4= new Lance(pessoa2,1000);
    Lance lance5= new Lance(pessoa2,2000);
    Lance lance6= new Lance(pessoa3,500);
    Lance lance7= new Lance(pessoa3,5000);
    
    //leilao ocorrendo
    if(leilao1.recebeLance(lance1, "Abacate")==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    if(leilao1.recebeLance(lance1, "Melão")==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    if(leilao1.recebeLance(lance2, terceiroLote.getDescricao())==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    if(leilao1.recebeLance(lance3, terceiroLote.getDescricao())==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    if(leilao1.recebeLance(lance6, terceiroLote.getDescricao())==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    if(leilao1.recebeLance(lance5, segundoLote.getDescricao())==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    if(leilao1.recebeLance(lance4, segundoLote.getDescricao())==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    if(leilao1.recebeLance(lance7, "Abacate")==true)
        System.out.println("Lance aprovado!");
    else
        System.out.println("Lance negado!");
    
    System.out.printf("%s\n",leilao1.encerraLeilao());
    }
}
