package questao1;

import java.util.*;

public class Teste {

    public static void main(String[] args) {
        int s;
        Agenda agenda = new Agenda();
        Scanner input = new Scanner(System.in);
        Contato a = new Contato("Joao", "2143-5906", "@Camille");
        Contato b = new Contato("Ralf", "2168-6706", "@Lalf");
        Contato c = new Contato("Morato", "2143-9006", "@Moratinho");
        ArrayList <Contato> contatosIniciais = new ArrayList();
        contatosIniciais.add(a);
        contatosIniciais.add(b);
        contatosIniciais.add(c);
        agenda.setContatos(contatosIniciais);
        String nome, numero, email;
        do {
            System.out.println("O que deseja fazer com a agenda agora?"
                    + "\n(DIGITE UM NÚMERO)"
                    + "\n (1) Inserir novo contato "
                    + "\n (2) Exibir número de contatos"
                    + "\n (3) Exibir um contato"
                    + "\n (4) Excluir um contato"
                    + "\n (5) Exibir todos os contatos da agenda"
                    + "\n (0) Sair e exibir agenda\n");
            s = input.nextInt();
            switch (s) {
                case 1:
                    System.out.println("Nome do contato");
                    nome = input.next();
                    System.out.println("Número do contato");
                    numero = input.next();
                    System.out.println("E-mail do contato");
                    email = input.next();
                    Contato aux = new Contato (nome, numero, email);
                    if(agenda.insereContato(aux))
                        System.out.println("Contato inserido");
                    else
                        System.out.println("Contato não pôde ser inserido");
                    break;
                case 2:
                    System.out.printf("Numero de contatos: %d\n",agenda.numeroContatos());
                    break;
                case 3:
                    System.out.println("Qual o nome do contato?");
                    nome = input.next();
                    System.out.printf("%s", agenda.exibeContato(nome));
                    break;
                case 4:
                    System.out.println("Qual o nome do contato?");
                    nome = input.next();
                    if(agenda.excluiContato(nome))
                        System.out.println("Excluido com sucesso!");
                    else
                        System.out.println("Contato não encontrado!");
                    break;
                case 5:
                    System.out.printf("%s\n", agenda.exibeContatos());
                    break;                        
            }
        } while (s != 0);
        System.out.println("\n\nAgenda final\n");
        System.out.printf("%s", agenda.exibeContatos());
    }
}
