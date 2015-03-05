import greenfoot.*;
import java.util.List;

/**
 * Description of class GumballMachine.
 * This class accepets coin from User and stores it. On Turning of Crank, Aliens get started with their work
 * @author Vipul Kanade
 * @version (02/01/2015)
 */
public class GumballMachine extends Actor
{
    private Actor actorCoin ;
    
    private boolean bAllowCoin          = true  ;
    //private boolean bCrankTurned        = false ;
    private boolean bInvalidCoin        = false ;
    private boolean bIsBallDisplayed    = false ;
    
    private List inspectorList;
    
    private Coin coin ;
    
    /**
     * GumballMachine Constructor
     */
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ;
    }
    
    /**
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * This Method will invoke Gumball Machine to accept Coins and
     * If Crank turned, after receiving coin, forward the execution to Inspector for Inspection.
     */
    public void act() 
    {
        if( ((GumballMachine)getWorld()).getAllowCoin() ) {
            //display message of Insert coin in Gumball Machine on Screen
            ((GumballMachine)getWorld()).addObject(new InsertCoin(), 367, 57) ;
            //Call Function insertCoin to check if coin can be inserted or not.
            //returns value true if coin can be inserted, false otherwise
                if(insertCoin()) {
                    //to remove the displayed ball on screen
                    ((GumballMachine)getWorld()).setIsBallDisplayedFalse() ;
                    ((GumballMachine)getWorld()).setIsInValidCoinFalse() ;
                    //Function to remove the coin dragged and inserted in Gumball Machine from Screen
                    removeCoin() ;
                    //Set values so no other coin can be inserted until specified otherwise.
                    ((GumballMachine)getWorld()).setAllowCoinFalse() ;
                    
                }
        }    
            
        // if after inserting coin, crank is turned(Mouse Clicked), set value of CrankTurned to True.
        if ( Greenfoot.mousePressed(this) && !((GumballMachine)getWorld()).getAllowCoin() ) {  
           //((GumballWorld)getWorld()).setCrankTurnedTrue() ;
           inspectorList = getWorld().getObjects(Inspector.class) ;
           if (inspectorList != null && inspectorList.size() > 0) {
               inspectorList.get(Greenfoot.getRandomNumber(inspectorList.size())).inspectCoin(getCoin());
            }
        }
    }  
    
    /**
     * Function to Check whether coin can be inserted or not.
     * @returns - true, if coin can be inserted
     *           false, if not
     */
    private boolean insertCoin() {
        actorCoin = getOneObjectAtOffset(0, 0, Coin.class) ;
        
        if(actorCoin != null) {
            return true ;
        } else {
            return false ;
        }
    }
    
    /**
     * Function to remove coin and inserting it in Gumball Machine from the Screen.
     */
    private void removeCoin() {
        actorCoin = getOneObjectAtOffset(0, 0, Coin.class) ;
        
        if(actorCoin != null) {
                ((GumballMachine)getWorld()).setCoin((Coin)actorCoin) ; 
                ((GumballMachine)getWorld()).addObject(new CoinInserted(), 367, 57) ;
                getWorld().removeObject( actorCoin ) ;
        }
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
    
    /** // Returns state of Crank, true for Crank Turned, False otherwise
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
    }   */
    
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
