import greenfoot.*;

/**
 * Description of class BallEjected.
 * This Class checks whether Gumball is Displayed on Screen or Not
 * @author Vipul Kanade 
 * @version (02/03/2015)
 */
public class BallEjected extends Message
{
    /**
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. 
     * This Will Check whether Gumball is Displayed on Screen or Not, 
     * if Value is false it'll Remove the Message of Ball Ejected by Picker Alien.
     */
    public void act() 
    {
        if ( !((GumballMachine)getWorld().getObjects(_cls_)).getIsBallDisplayed() ) {
            getWorld().removeObject(this) ;
        }
    }    
}
