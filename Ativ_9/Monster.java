import java.util.ArrayList;
import java.util.Iterator;

public class Monster {
    
    public String description;
    /*Ideia do drop e life para combate e RPG mesmo com batalha e tal
      não conseguirei implementar até o dia de entrega desse projeto,
      porem deixo "semi-implementado" para depois finalizar*/
    public ArrayList <Item> drop;
    //public float life; //tvz implemente
    
    public Monster(String description){
        this.description = description;
        this.drop = new ArrayList();
    }
    
    public void addDrop(Item item){
        this.drop.add(item);
    }
    
    public void addDrop(ArrayList<Item> item){
        Iterator <Item> it = this.drop.iterator();
        while(it.hasNext()){
            this.drop.add(it.next());
        }
    }
}
