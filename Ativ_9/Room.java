/*
 * Class Room - a room in an adventure game.
 *
 * This class is the main class of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

class Room 
{
    public String description;
    public HashMap <String,Room> exits;
    private ArrayList <Item> itens;
    private ArrayList <BotPerson> bots;
    private ArrayList <Monster> monsters;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     */
    public Room(String description) 
    {
        this.description = description;
        this.exits = new HashMap();
        this.itens = new ArrayList();
        this.bots = new ArrayList();
        this.monsters = new ArrayList();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down) 
    {
        this.exits.put("north", north);
        this.exits.put("east", east);
        this.exits.put("south", south);
        this.exits.put("west", west);
        this.exits.put("up", up);
        this.exits.put("down", down);
    }

    /**
     * Return the description of the room (the one that was defined
     * in the constructor).
     */
    public String getDescription()
    {
        return description;
    }
    
    public String getExits(){
        String string;
        string = "\nExits:\n";
        if(this.exits.get("north") != null)
            string += "North -- "+ this.exits.get("north").getDescription()+"\n";
        if(this.exits.get("east") != null)
            string += "East -- "+ this.exits.get("east").getDescription()+"\n";
        if(this.exits.get("south") != null)
            string += "South -- "+ this.exits.get("south").getDescription()+"\n";
        if(this.exits.get("west") != null)
            string += "West -- "+ this.exits.get("west").getDescription()+"\n";
        if(this.exits.get("up") != null)
            string += "Up -- "+ this.exits.get("up").getDescription()+"\n";
        if(this.exits.get("down") != null)
            string += "Down -- "+ this.exits.get("down").getDescription()+"\n";
        return string;
    }
    
    public void setItem(ArrayList<Item> item){
        this.itens = item;
    }
    
    public void addItem(Item item){
        this.itens.add(item);
    }
    
    public String getItens(){
        String string;
        Iterator <Item> it = this.itens.iterator();
        string = "\nItens:\n";
        if(!it.hasNext())
            string = "\nNão há itens na sala!\n";
        while(it.hasNext())
            string += it.next().description + "\n";
        return string;
    }
    
    public void setBots(ArrayList<BotPerson> bots){
        this.bots = bots;
    }
    
    public void addBots(BotPerson bot){
        this.bots.add(bot);
    }
    
    public String getBots(){
        String string;
        Iterator <BotPerson> it = this.bots.iterator();
        string = "\nBots:\n";
        if(!it.hasNext())
            string = "\nNão há bots na sala!\n";
        while(it.hasNext())
            string += it.next().nome + "\n";
        return string;
    }
    
    public void setMonsters(ArrayList<Monster> monsters){
        this.monsters = monsters;
    }
    
    public void addMonster(Monster monster){
        this.monsters.add(monster);
    }
    
    public String getMonsters(){
        String string;
        Iterator <Monster> it = this.monsters.iterator();
        string = "\nMonsters:\n";
        if(!it.hasNext())
            string = "\nNão há monstros na sala!\n";
        while(it.hasNext())
            string += it.next().description + "\n";
        return string;
    }

}
