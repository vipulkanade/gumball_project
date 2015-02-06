import greenfoot.*;

/**
 * Description of class InsertCoin.
 * This Class creates InsertCoin Object and checks if Coin is Inserted remove message "Please Insert a Coin" from Screen.
 * @author Vipul Kanade 
 * @version (02/03/2015)
 */
public class InsertCoin extends Message
{
    
    /**
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. 
     * This will check whether Message to Insert Coin is to be removed.
     * If value is False it'll remove InsertCoin Message from Screen.
     */
    public void act() 
    {
        if( !((GumballWorld)getWorld()).getAllowCoin() ) {
            getWorld().removeObject(this) ;
        }
    }    
}
