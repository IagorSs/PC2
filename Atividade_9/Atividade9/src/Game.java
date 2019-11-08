/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

class Game 
{
    private Parser parser;
    private Room currentRoom;
    private CommandWords comandos;
    private final boolean haveGUI = false; //alterar em implementação de interface gráfica
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        instanceObjects();
        this.parser = new Parser();
        this.comandos = new CommandWords();
    }

    /*
      Create all
    */
    
    private void instanceObjects()
    {
        //criando itens de salas
        Item bloom, stair;
        
        bloom = new Item("One oooold bloom, but usable");
        stair = new Item("One stair, never know when this can be useful...");
        
        //criando bots
        BotPerson scientist, teacher, teacher1, nerd, barwoman, hippie;
        
        scientist = new BotPerson("One crazy and terrify scientist");
        teacher = new BotPerson("A fat teacher of physical education");
        teacher1 = new BotPerson("One simpatic teacher of arts");
        nerd = new BotPerson("Only one more nerd in the PC");
        barwoman = new BotPerson("One wonderfull woman in charge of serving the bar");
        hippie = new BotPerson("One strange meditating in piece");
        
        //criando monstros e seus respectivos drops
        Monster spider, ghost, bully;
        
        spider = new Monster("A giant spider");
        ghost = new Monster("One cold and inoffensive ghost");
        bully = new Monster("One stupid man abusing of all people");
        
        
        //Itens de monstros
        Item web, nothing, switchblade, chair;
        
        web = new Item("A little reward to defeat one spider");
        nothing = new Item("How do you want this drop anything, WTF?");
        switchblade = new Item("One switchblade for any moment");
        chair = new Item("One simple chair (to defend yourself maybe)");
        
        //Colocando itens nos monstros
        spider.addDrop(web);
        ghost.addDrop(nothing);
        bully.addDrop(switchblade);
        
        Room outside, theatre, pub, lab, office, basement, attic;
      
        // create the rooms
        outside = new Room("Outside");
        theatre = new Room("Theatre");
        pub = new Room("Pub");
        lab = new Room("Computing lab");
        office = new Room("Computing admin office");
        basement = new Room("Basement");
        attic = new Room("Attic");
        
        // initialise room exits
        outside.setExits(null, theatre, lab, pub, null, null);
        theatre.setExits(null, null, null, outside, null, null);
        pub.setExits(null, outside, null, null, null, null);
        lab.setExits(outside, office, null, null, null, null);
        office.setExits(null, null, null, lab, attic, basement);
        attic.setExits(null, null, null, null, null, office);
        basement.setExits(null, null, null, null, office, null);
        
        // colocando itens, monstros e bots em...
        //pub
        pub.addBots(barwoman);
        
        pub.addItem(chair);
        
        pub.addMonster(bully);
        
        //basement
        basement.addMonster(ghost);        
        basement.addMonster(spider);
        
        //theatre
        theatre.addBots(teacher1);
        
        theatre.addItem(stair);
        
        //outside
        outside.addBots(teacher);
        
        //attic
        attic.addBots(hippie);
        
        attic.addMonster(spider);
        
        //office
        office.addBots(nerd);
        
        //lab
        lab.addBots(scientist);
        
        lab.addItem(bloom);
        
        // start game outside
        currentRoom = outside;
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        printString("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        printString("\nWelcome to Adventure!");
        printString("Adventure is a new, incredibly boring adventure game.");
        printString("Type 'help' if you need help.");
        printString("\nYou are " + currentRoom.getDescription());
        printString(currentRoom.getExits() + "\n");
    }

    /**
     * Given a command, process (that is: execute) the command.
     * If this command ends the game, true is returned, otherwise false is
     * returned.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            printString("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            printHelp();
        else if (commandWord.equals("go"))
            goRoom(command);
        else if (commandWord.equals("quit"))
            wantToQuit = quit(command);
        else if (commandWord.equals("search"))
            searchRoom(command, false);
        else if (commandWord.equals("selfie"))
            printString("Parabéns, você tirou uma foto de você mesmo!! Ta feliz? Com auto-estima melhor??\n Vai jogar logo >:x");
            

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        printString("You are lost. You are alone. You wander");
        printString("around at the university.");
        printString("\nYour command words are:");
        printString(this.comandos.printCommands() + "\n");
    }

    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    
    private void searchRoom(Command command, boolean ignore){
        if(!ignore)
            if(command.hasSecondWord()){
                printString("You only can search this room, don't try troll me writing anything :P\n");
                return;
            }
        
        printString(this.currentRoom.getItens()+" "+this.currentRoom.getMonsters()
                +" "+this.currentRoom.getBots());
    }
    
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            printString("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        if(direction.equals("north"))
            nextRoom = currentRoom.exits.get("north");
        if(direction.equals("east"))
            nextRoom = currentRoom.exits.get("east");
        if(direction.equals("south"))
            nextRoom = currentRoom.exits.get("south");
        if(direction.equals("west"))
            nextRoom = currentRoom.exits.get("west");
        if(direction.equals("up"))
            nextRoom = currentRoom.exits.get("up");
        if(direction.equals("down"))
            nextRoom = currentRoom.exits.get("down");

        if (nextRoom == null)
            printString("There is no door!");
        else {
            currentRoom = nextRoom;
            printString("You are in " + currentRoom.getDescription());
            searchRoom(command, true);
            printString(currentRoom.getExits());
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game. Return true, if this command
     * quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            printString("Quit what?");
            return false;
        }
        else
            return true;  // signal that we want to quit
    }
    
    //Implementação pedida na questão 11
    private void printString(String string){
        if(haveGUI){
            //Implementações para interface gráfica
        }
        else
            System.out.printf("%s\n",string);
    }
}
