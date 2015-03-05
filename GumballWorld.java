import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author Vipul Kanade
 * @version (02/03/2015)
 */
public class GumballWorld extends World
{

    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        // Create and Add Gumball Machine Object in Gumball World
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        gumballmachine.setLocation(359, 280);
        
        // Create and Add Inspector Object to Gumball World
        Inspector inspector = new Inspector();
        addObject(inspector, 533, 291);
        
        // Create and Add Random Picker Object to Gumball World
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(669, 94);

        // Create andAdd Gren Picker Object
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
        
        // Add Quarter, Penny, Fake Quarter Objects in Gumball World
        Quarter quarter2 = new Quarter();
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;
        addObject(quarter2, 157, 426);
        quarter2.setLocation(67, 354);
    }
}