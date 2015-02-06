import greenfoot.*;

/**
 * Description of class GumballMachine.
 * This class accepets coin from User and stores it. On Turning of Crank, Aliens get started with their work
 * @author Vipul Kanade
 * @version (02/01/2015)
 */
public class GumballMachine extends Actor
{
    private Actor actorCoin ;
    
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
        if( ((GumballWorld)getWorld()).getAllowCoin() ) {
            //display message of Insert coin in Gumball Machine on Screen
            ((GumballWorld)getWorld()).addObject(new InsertCoin(), 367, 57) ;
            //Call Function insertCoin to check if coin can be inserted or not.
            //returns value true if coin can be inserted, false otherwise
                if(insertCoin()) {
                    //to remove the displayed ball on screen
                    ((GumballWorld)getWorld()).setIsBallDisplayedFalse() ;
                    ((GumballWorld)getWorld()).setIsInValidCoinFalse() ;
                    //Function to remove the coin dragged and inserted in Gumball Machine from Screen
                    removeCoin() ;
                    //Set values so no other coin can be inserted until specified otherwise.
                    ((GumballWorld)getWorld()).setAllowCoinFalse() ;
                    
                }
        }    
            
        // if after inserting coin, crank is turned(Mouse Clicked), set value of CrankTurned to True.
        if ( Greenfoot.mousePressed(this) && !((GumballWorld)getWorld()).getAllowCoin() ) {  
           ((GumballWorld)getWorld()).setCrankTurnedTrue() ;
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
                ((GumballWorld)getWorld()).setCoin((Coin)actorCoin) ; 
                ((GumballWorld)getWorld()).addObject(new CoinInserted(), 367, 57) ;
                getWorld().removeObject( actorCoin ) ;
        }
    }
}
