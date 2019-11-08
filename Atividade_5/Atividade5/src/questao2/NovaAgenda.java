package questao2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class NovaAgenda {
    HashMap <String,Contato> agenda;
    
    private Contato buscaContato(String nome){
        Set<String> key = agenda.keySet();
        Iterator <String> iterador = key.iterator();
        String aux;
        while(iterador.hasNext()){
            aux = iterador.next();
            if(aux.equals(nome))
                return this.agenda.get(aux);
        }return null; //não encontrou contato        
    }

    public HashMap<String, Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(HashMap<String, Contato> agenda) {
        this.agenda = agenda;
    }

    public NovaAgenda() {
        this.agenda = null;
    }
    
    public boolean insereContato(Contato contato){
        if(buscaContato(contato.getNome())==null){
            agenda.put(contato.getNome(), contato);
            return true;
        }return false;
    }
    
    public int numeroContato(){
        return agenda.size();
    }
    
    public String exibeContato(String nome){
       String auxString="       Contato\n"+"\nNome: "+nome;
       if(agenda.get(nome)==null){
           auxString= "Contato não encontrado!\n";
        }else
           auxString += "\nTelefone: "+agenda.get(nome).getTelefone()+"\nE-mail: "+agenda.get(nome).getEmail()+"\n";       
       return auxString;
    }
    
    public boolean excluiContato(String nome){        
       if(agenda.remove(nome)==null)
           return false;
        return true;
    }
    
    public String exibeAgenda(){
        String auxString=null;
        Set<String> key = agenda.keySet();
        Iterator <String> iterador = key.iterator();
        while(iterador.hasNext())
            auxString += exibeContato(iterador.next());
        if(auxString == null)
            auxString = "\nNão há contatos na agenda!\n";
        return auxString;
    }
}
