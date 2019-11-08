public class Enquete{
    
    public void Enquete(){} //Construtor
            
    private int alunos;

    public int getAlunos() { //retorna numero de alunos
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
    
    private int Notas[]=new int[alunos];    //fazer isso como método construtor(pode assim? e.e)
    

    public int[] getNotas() {
        return Notas;
    }

    public void setNotas(int[] Notas) { //perguntar se pode isso
        this.Notas = Notas;
    }
    
    
    public int[] frequenciaNotas(){
        int c[]=new int[10];//vetor para armazenar frequência(c[0]==frequencia da nota 1 por exemplo)
        for(int ic=0;ic<10;ic++){
            c[ic]=0;
        }
        for(int i=0;i<alunos;i++){
            c[Notas[i]-1]++;
        }return c;
    }
    
    public float notaMedia(){
        float s=0;
        for(int i=0;i<alunos;i++){
            s+=Notas[i];
        }s= s/alunos;
        return s;
    }
}