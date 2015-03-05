import greenfoot.*;

/**
 * Description of class InvalidCoin.
 * This class will check whether coin is Invalid, if it is valid, it'll remove Invalid message from screen.
 * @author Vipul Kanade
 * @version (02/03/2015)
 */
public class InvalidCoin extends Message
{
    /**
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * This will check whether Coin is Invalid, if Invalid is false,
     * it'll remove the message about Invalid coin displayed on screen.
     */
    public void act() 
    {
        if( !((GumballMachine)getWorld()).getIsInValidCoin() ) {
            getWorld().removeObject(this) ;
        }
    }    
}
