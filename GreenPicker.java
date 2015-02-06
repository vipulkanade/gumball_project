import greenfoot.*;

/**
 * Description of class GreenPicker here.
 * This will only choose Green Gumball to Display
 * @author Vipul Kanade 
 * @version (02/03/2015)
 */
public class GreenPicker extends Picker
{
    /**
     * This will only choose Green Gumball to Eject
     */
    public void pick() {
        //Display Green Gumball on Screen.
            getWorld().addObject(new GreenGumball(), 365, 500) ;
            //Display Gumball Ejected Message on Screen.
            getWorld().addObject(new BallEjected(), 550, 450) ;
            
            // As the Work of Green Picker is completed,
            // Reset Values for Gumball Machine to accept the coins further.
            ((GumballWorld)getWorld()).setIsBallDisplayedTrue() ;
            ((GumballWorld)getWorld()).setAllowCoinTrue();
            //This will disable Inspector Act Method from running unless it should and as specified by Gumball Machine
            ((GumballWorld)getWorld()).setCrankTurnedfalse() ;
    }
}
