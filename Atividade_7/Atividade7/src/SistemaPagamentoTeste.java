import java.util.Scanner;

public class SistemaPagamentoTeste {
    public static void main(String[] args) {
        Pagavel a = new Assalariado("Eduardo", "Martins", 1234,43);
        Pagavel h = new Assalariado("Alessandra", "Martins", 1212,36);
        Pagavel b = new Comissionado("Iagor", "Sousa", 2657, 30,3200);
        Pagavel c = new AssalariadoComissionado("Felipe","Lucas",5564, 40,5000);
        Pagavel d = new Terceirizado("Gabriel","Quezada",9809, 43);
        Pagavel e = new Titulo(13,2,1300,12,4);
        Pagavel f = new Titulo(20,4,1500,18,4);
        Pagavel g = new Concessionaria(10,2,3000);
        ControlePagamento pagamentos = new ControlePagamento();
        if(pagamentos.adicionaPagavel(a))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        if(pagamentos.adicionaPagavel(a))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        if(pagamentos.adicionaPagavel(b))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        if(pagamentos.adicionaPagavel(c))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        if(pagamentos.adicionaPagavel(d))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        if(pagamentos.adicionaPagavel(e))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        if(pagamentos.adicionaPagavel(f))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        if(pagamentos.adicionaPagavel(g))
            System.out.println("Pagamento adicionado à lista de pagamentos");
        else
            System.out.println("Pagamento não foi adicionado à lista");
        int aux1,aux2,int1,int2,int3,int4;
        double doub1;
        String st1,st2;
        Scanner input = new Scanner(System.in);
        do{
            System.out.printf("O que deseja fazer agora?\n"
                    + "(0) Sair e imprimir folha de pagamento final\n"
                    + "(1) Adicionar novo empregado\n"
                    + "(2) Adicionar nova conta\n"
                    + "(4) Imprimir gastos com empregados\n"
                    + "(5) Imprimir gastos com contas\n"
                    + "(6) Imprimir toda a folha de pagamento\n");
            aux1 = input.nextInt();
            switch(aux1){
                case 1:
                    Pagavel auxiliar;
                    System.out.printf("\nNome: ");
                    st1 = input.next();
                    System.out.printf("\nSobrenome: ");
                    st2 = input.next();
                    System.out.printf("\nIdentidade: ");
                    int1 = input.nextInt();
                    System.out.printf("\nHoras trabalhadas: ");
                    int2 = input.nextInt();
                    do{
                        System.out.printf("Qual o tipo de empregado?\n"
                                + "(0) Voltar\n"
                                + "(1) Assalariado\n"
                                + "(2) Comissionado\n"
                                + "(3) Assalariado Comissionado\n"
                                + "(4) Terceirizado\n");
                        aux2 = input.nextInt();
                        switch(aux2){
                            case 1:
                                auxiliar = new Assalariado(st1,st2,int1,int2);
                                pagamentos.adicionaPagavel(auxiliar);
                                aux2=0;
                                break;
                            case 2:
                                System.out.printf("\nVendas do Funcionário: ");
                                doub1 = input.nextDouble();
                                auxiliar = new Comissionado(st1,st2,int1,int2,doub1);
                                pagamentos.adicionaPagavel(auxiliar);
                                aux2=0;
                                break;
                            case 3:
                                System.out.printf("\nVendas do Funcionário: ");
                                doub1 = input.nextDouble();
                                auxiliar = new AssalariadoComissionado(st1,st2,int1,int2,doub1);
                                pagamentos.adicionaPagavel(auxiliar);
                                aux2=0;
                                break;
                            case 4:
                                auxiliar = new Terceirizado(st1,st2,int1,int2);
                                pagamentos.adicionaPagavel(auxiliar);
                                aux2=0;
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Valor inválido, insira outro!");
                                break;
                        }
                    }while(aux2!=0);
                    break;
                case 2:
                    Conta contaAux;
                    System.out.println("\nDia de vencimento: ");
                    int1 = input.nextInt();
                    System.out.println("\nMês do vencimento: ");
                    int2 = input.nextInt();
                    System.out.println("\nValor da conta: ");
                    doub1 = input.nextDouble();
                    System.out.println("\nDia que foi paga: ");
                    int3 = input.nextInt();
                    System.out.println("\nMês que foi paga: ");
                    int4 = input.nextInt();
                    do{
                        System.out.printf("Qual o tipo de conta?\n"
                                + "(0) Voltar\n"
                                + "(1) Titulo\n"
                                + "(2) Concessionaria\n");
                        aux2 = input.nextInt();
                        switch(aux2){
                            case 0:
                                break;
                            case 1:
                                contaAux = new Titulo(int1,int2,doub1,int3,int4);
                                pagamentos.adicionaPagavel(contaAux);
                                aux2=0;
                                break;
                            case 2:
                                contaAux = new Concessionaria(int1,int2,doub1,int3,int4);
                                pagamentos.adicionaPagavel(contaAux);
                                aux2=0;
                                break;
                            default:
                                System.out.println("Valor inválido, insira outro!");
                                break;
                        }
                    }while(aux2!=0);
                    break;
                case 4:
                    System.out.printf("%s", pagamentos.imprimeEmpregados());
                    break;
                case 5:
                    System.out.printf("%s", pagamentos.imprimeContas());
                    break;
                case 6:
                    System.out.printf("%s", pagamentos.imprimePagamentos());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor inválido, insira outro!");
                    break;
            }
        }while(aux1!=0);
        System.out.printf("%s", pagamentos.imprimePagamentos());
    }
}
