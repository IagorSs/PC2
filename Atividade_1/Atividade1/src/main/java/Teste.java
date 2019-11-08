import java.util.Scanner;
import java.security.SecureRandom;


public class Teste {
    public static void main(String args[]){
        
        Enquete myEnquete =new Enquete();
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o número de alunos que participarão da pesquisa\n");
        int numeroAlunos =input.nextInt();
        myEnquete.setAlunos(numeroAlunos);
        int notas[]= new int[numeroAlunos];
        SecureRandom gerador = new SecureRandom();
        int i;
        for(i=0;i<numeroAlunos;i++){
            notas[i]=gerador.nextInt(10)+1;//notas de 1 a 10
        }
        myEnquete.setNotas(notas);
        /*
        for(i=0;i<numeroAlunos;i++){ //Para checar as notas dos alunos e conferir com as medidades de dispersão 
            System.out.printf("%d)Aluno:%d\n",i+1,notas[i]);
        }*/
        for(int i1=0;i1<10;i1++)
            System.out.printf("Frequência da nota %d: %d\n",i1+1,myEnquete.frequenciaNotas()[i1]);
        System.out.printf("Numero de participantes da Enquete: %d\n",myEnquete.getAlunos());
        System.out.printf("Nota média na Enquete: %f\n",myEnquete.notaMedia());
    }
}
