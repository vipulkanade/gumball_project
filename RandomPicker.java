import greenfoot.*; 

/**
 * Description of class RandomPicker.
 * This class will select a Random (Red - Blue - Green ) Gumballs from Gumball Machine and will eject it.
 * @author Vipul Kanade 
 * @version (02/03/2015)
 */
public class RandomPicker extends Picker
{   
    /**
     * This will select a (Red - Blue - Green ) Gumballs randomly from Gumball Machine.
     */
    public void pick() {
        switch(Greenfoot.getRandomNumber(3)) {
                case 0:
                    //Display Red Gumball on Screen
                    getWorld().addObject(new RedGumball(), 365, 500) ;
                    break;
            
                case 1:
                    //Display Blue Gumball on Screen
                    getWorld().addObject(new BlueGumball(), 365, 500) ;
                    break;
            
                case 2:
                    //Display Green Gumball on Screen
                    getWorld().addObject(new GreenGumball(), 365, 500) ;            
                    break;
            
                default :
                    //Display Red Gumball on Screen
                    getWorld().addObject(new RedGumball(), 365, 500) ;
                    break;
            }
            //Display Ejected Gumball
            getWorld().addObject(new BallEjected(), 720, 240) ;
            //As the random Picker work is completed after ejecting Gumball, reset values to accept Coin from Machine
            ((GumballWorld)getWorld()).setIsBallDisplayedTrue() ;
            ((GumballWorld)getWorld()).setAllowCoinTrue();
            //This will disable Inspector Act Method from running unless it should and as specified by Gumball Machine
            ((GumballWorld)getWorld()).setCrankTurnedfalse() ;
    }
}
