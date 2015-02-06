import greenfoot.*;

/**
 * Description of class GreenGumball.
 * This will check if the ball is being displayed, if false, it'll remove the Green Gumball Displayed on screen
 * @author Vipul Kanade
 * @version (02/01/2015)
 */
public class GreenGumball extends Gumball
{
    /**
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * This will check if the ball is being displayed, if false,
     * it'll remove the Green Gumball Displayed on screen.
     */
    public void act() 
    {
        if (!((GumballWorld)getWorld()).getIsBallDisplayed()) {
            getWorld().removeObject(this) ;
        }
    }    
}
