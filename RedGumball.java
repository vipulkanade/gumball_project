import greenfoot.*; 

/**
 * Description of class RedGumball.
 * This will check if the ball is being displayed, if false, it'll remove the Red Gumball Displayed on screen
 * @author Vipul Kanade
 * @version (02/01/2015)
 */
public class RedGumball extends Gumball
{
    /**
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * This will check if the ball is being displayed, if false,
     * it'll remove the Red Gumball Displayed on screen.
     */
    public void act() 
    {
        if (!((GumballMachine)getWorld()).getIsBallDisplayed()) {
            getWorld().removeObject(this) ;
        }
   }    
}
