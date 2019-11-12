package questao1;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
    private ArrayList <Contato> contatos;
    
    private Contato buscaContato(String nome){
        Iterator <Contato> it = this.contatos.iterator();
        Contato aux;
        while(it.hasNext()){
            aux = it.next();
            if(aux.getNome().equals(nome))
                return aux;
        }return null; //não encontrou contato
    }
    
    public Agenda() {
        this.contatos = null;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
    
    public boolean insereContato(Contato contato){
        if(this.buscaContato(contato.getNome())==null){
            this.contatos.add(contato);
            return true;
        }return false;
    }
    
    public int numeroContatos(){
        if(this.contatos == null)
            return 0;
        return this.contatos.size();
    }
        
    public String exibeContato(String nome){
        Iterator <Contato> it = this.contatos.iterator();
        String auxString = "Contato não encontrado!\n";
        Contato auxContato = this.buscaContato(nome);
        if(auxContato == null);
        else
            auxString = "\nContato\n\nNome: "+auxContato.getNome()+"\nTelefone: "+auxContato.getTelefone()+"\nE-mail: "+auxContato.getEmail()+"\n";
        return auxString;
    }
    
    public boolean excluiContato(String nome){
        Contato aux = this.buscaContato(nome);
        if(aux==null)
            return false;
        else{
            this.contatos.remove(aux);
            return true;
        }
    }
    
    public String exibeContatos(){
        String auxString = "           Agenda\n\n";
        Contato auxContato;
        if(this.contatos != null){
            Iterator <Contato> it = this.contatos.iterator();
            while(it.hasNext()){
                auxContato = it.next();
                auxString += this.exibeContato(auxContato.getNome());
            }
        }
        return auxString;
    }
}