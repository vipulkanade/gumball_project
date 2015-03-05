import greenfoot.*;

/**
 * Description of class CoinInserted.
 * This Checks if Coin is not inserted, remove message "Have Coin!!!" from screen.
 * @author Vipul Kanade
 * @version (02/02/2015)
 */
public class CoinInserted extends Message
{
    /**
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * This method will whether coin is Inserted or not, if not Inserted,
     * it'll remove message of Coin Inserted(Have Coin) from display screen.
     */
    public void act() 
    {
        if (((GumballMachine)getWorld()).getAllowCoin()) {
            getWorld().removeObject(this) ;
        }
    }    
}
