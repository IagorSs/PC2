package questao2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        TrataFormas tratador = new TrataFormas();
        Scanner input = new Scanner(System.in);
        int continua, continua1;
        double auxLado1,auxLado2,auxLado3;
        do{
            System.out.println("Digite o que deseja fazer\n"
                    + "(0) Sair e exibir formas com suas características\n"
                    + "(1) Adicionar nova forma à lista\n"
                    + "(2) Exibir as formas atuais e suas características\n");
            continua = input.nextInt();
            switch(continua){
                case 1:
                    Forma aux;
                    System.out.println("Digite qual a forma\n"
                            + "(1) Triangulo\n"
                            + "(2) Circulo\n"
                            + "(3) Quadrado\n"
                            + "(4) Cubo\n"
                            + "(5) Esfera\n"
                            + "(6) Tetraedro\n");
                    continua1 = input.nextInt();
                    switch(continua1){
                        case 1:
                            System.out.println("Digite o tamanho do primeiro lado");
                            auxLado1 = input.nextFloat();
                            System.out.println("Digite o tamanho do segundo lado");
                            auxLado2 = input.nextFloat();
                            System.out.println("Digite o tamanho do terceiro lado");
                            auxLado3 = input.nextFloat();
                            aux = new Triangulo(auxLado1,auxLado2,auxLado3);
                            tratador.addForma(aux);
                            break;
                        case 2:
                            System.out.println("Digite o raio");
                            auxLado1 = input.nextFloat();
                            aux = new Circulo(auxLado1);
                            tratador.addForma(aux);
                            break;
                        case 3:
                            System.out.println("Digite o tamanho do lado");
                            auxLado1 = input.nextFloat();
                            aux = new Quadrado(auxLado1);
                            tratador.addForma(aux);
                            break;
                        case 4:
                            System.out.println("Digite o tamanho do lado");
                            auxLado1 = input.nextFloat();
                            aux = new Cubo(auxLado1);
                            tratador.addForma(aux);
                            break;
                        case 5:
                            System.out.println("Digite o tamanho do raio");
                            auxLado1 = input.nextFloat();
                            aux = new Esfera(auxLado1);
                            tratador.addForma(aux);
                            break;
                        case 6:
                            System.out.println("Digite o tamanho do lado");
                            auxLado1 = input.nextFloat();
                            aux = new Tetraedro(auxLado1);
                            tratador.addForma(aux);
                            break;
                        default:
                            System.err.println("Inválido!\n");
                            break;
                    }break;
                case 2:
                    System.out.printf("%s", tratador.obterCaracterísticas());
                    break;
                case 0:
                    break;
                default:
                    System.err.println("Inválido!");
                    break;
            }
        }while(continua != 0);
        System.out.printf("%s", tratador.obterCaracterísticas());
    }
}
