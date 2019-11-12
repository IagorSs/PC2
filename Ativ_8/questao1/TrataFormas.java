package questao1;

import java.util.Iterator;
import java.util.ArrayList;

public class TrataFormas {
    private ArrayList <Forma> formas;

    public TrataFormas() {
        this.formas = new ArrayList<>();
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }
    
    public void addForma(Forma forma){
        this.formas.add(forma);
    }
    
    public String obterCaracterísticas(){
        Forma aux;
        String retorno = "";
        Iterator <Forma> it;
        it = this.formas.iterator();
        while(it.hasNext()){
            aux = it.next();
            if(aux instanceof FormaBidimensional){
                retorno += "Forma bidimensional - ";
                if(aux instanceof Circulo)
                    retorno += "Circulo\n";
                else if(aux instanceof Triangulo)
                    retorno += "Triangulo\n";
                else if(aux instanceof Quadrado)
                    retorno += "Quadrado\n";
                retorno += "Area: "+aux.obterArea()+"\n";
            }else if(aux instanceof FormaTridimensional){
                retorno += "Forma tridimensional - ";
                if(aux instanceof Cubo)
                    retorno += "Cubo\n";
                else if(aux instanceof Esfera)
                    retorno += "Esfera\n";
                else if(aux instanceof Tetraedro)
                    retorno += "Tetraedro\n";
                retorno += "Area: "+aux.obterArea()+"\n";
                retorno += "Volume: "+((FormaTridimensional) aux).obterVolume()+"\n";
            }retorno += "\n";
        }if(retorno.equals(""))
            retorno = "Não há formas!\n";
        return retorno;
    }
}
