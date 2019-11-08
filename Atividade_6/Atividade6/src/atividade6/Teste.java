package atividade6;

import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    
    public static void main(String[] args) {
        int acao,qtdeCartas;
        ArrayList <Carta> auxCartas;
        Scanner input = new Scanner(System.in);
        Jogador a = new Jogador("Iagor");
        Jogador b = new Jogador("Quezada");
        Baralho baralho = new Baralho();
        System.out.println("Mesa embaralhando...");
        baralho.embaralhar();
        System.out.println("Quantas cartas devem ser distribuidas para cada jogador?");
        qtdeCartas = input.nextInt();
        do{
            auxCartas = baralho.separarCartas(qtdeCartas);
            if(auxCartas==null)
                System.out.println("Não foi possível dar todas as cartas aos jogadores!");
            else{
                a.recebeTodasCartas(auxCartas);
                auxCartas = baralho.separarCartas(qtdeCartas);
                if(auxCartas==null){
                    System.out.println("Não foi possível dar todas as cartas ao segundo jogador!");
                }else{
                    b.recebeTodasCartas(auxCartas);
                    System.out.printf("O jogador %s joga a carta %d de %s\n", a.getNome(), a.identificaMaiorCarta().getValor(), a.identificaMaiorCarta().getNaipe());
                    System.out.printf("O jogador %s joga a carta %d de %s\n", b.getNome(), b.identificaMaiorCarta().getValor(), b.identificaMaiorCarta().getNaipe());
                    if(a.identificaMaiorCarta().comparaCarta(b.identificaMaiorCarta())==a.identificaMaiorCarta())
                        System.out.printf("O jogador %s ganhou essa rodada!!\n", a.getNome());
                    else if(a.identificaMaiorCarta().comparaCarta(b.identificaMaiorCarta())==null)
                        System.out.println("Empate entre os jogadores");
                    else
                        System.out.printf("O jogador %s ganhou essa rodada!!\n", b.getNome());
                }
            }
            do{
                System.out.println("O que deseja fazer?\n"
                                + "(1)Remontar baralho com cartas já usadas\n"
                                + "(2)Jogar outra rodada com carta restantes no baralho\n"
                                + "(3)Finalizar jogo\n");
                acao = input.nextInt();
                switch(acao){
                    case 1:
                        baralho.remontarBaralho();
                        break;
                    case 2:
                    case 3:
                        break;
                    default:
                        System.out.println("Valor inválido!");
                }
            }while(acao!=1 && acao!=2 && acao!=3);
        }while(acao!=3);
    }
        
}
