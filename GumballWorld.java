import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author Vipul Kanade
 * @version (02/03/2015)
 */
public class GumballWorld extends World
{
    
    private boolean bAllowCoin          = true  ;
    private boolean bCrankTurned        = false ;
    private boolean bInvalidCoin        = false ;
    private boolean bIsBallDisplayed    = false ;
    
    private Coin coin ;

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
    
    /**
     *  Get Method, Returns Coin 
     */
    public Coin getCoin() {
        return coin;
    }

    /**
     *  Set Method, Set Value to Coin
     */
    public void setCoin(Coin coin) {
        this.coin = coin;
    }
    
    // Returns state of Crank, true for Crank Turned, False otherwise
    public boolean getCrankTurned() {
        return bCrankTurned;
    }
    
    // Set Crank to Turned state
    public void setCrankTurnedTrue() {
        bCrankTurned = true;
    }

    // Set Crank to Inactive state
    public void setCrankTurnedfalse() {
        bCrankTurned = false;
    }   
    
    //Returns whether Gumball machine should acccept coin or not.
    public boolean getAllowCoin() {
        return bAllowCoin ;
    }
    
    // Set true for Gumball Machine to accept coin
    public void setAllowCoinTrue() {
        bAllowCoin = true ;
    }

    // Set false for Gumball Machine to block accepting coin    
    public void setAllowCoinFalse() {
        bAllowCoin = false ;
    }
    
    // Returns whether Inserted Coin is Invalid or Valid
    public boolean getIsInValidCoin() {
        return bInvalidCoin ;
    }
    
    // Set Invalid Coin to true if Coin is Quarter
    public void setIsInValidCoinTrue() {
        bInvalidCoin = true ;
    }

    // Set Invalid Coin to False if Coin is Fake or Penny 
    public void setIsInValidCoinFalse() {
        bInvalidCoin = false ;
    }
    
    // Retuens whether ball has been displayed on screen or not
    public boolean getIsBallDisplayed() {
        return bIsBallDisplayed;
    }
    
    // Sets value to true if any ball is displayed on screen
    public void setIsBallDisplayedTrue() {
        bIsBallDisplayed = true;
    }
    
    // Sets value false when ball isn't displayed on screen
    public void setIsBallDisplayedFalse() {
        bIsBallDisplayed = false;
    }
}