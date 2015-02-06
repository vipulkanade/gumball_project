import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Description of class Inspector.
 * This class checks whether received coin is Quarter and valid, if valid, it'l randomly select RandomPicker or GreenPicker to disperse a Gumball.
 * @author Vipul Kanade 
 * @version (02/03/2015)
 */
public class Inspector extends Alien
{
    List<Picker> alienPickerList ;
    /**
     * Act -This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * This method checks if received coin is Quarter and valid, if valid, it'l randomly select RandomPicker or GreenPicker to disperse a Gumball.
     * if invalid coin received it'll show appropriate message.
     */
    public void act() 
    {
        alienPickerList = getWorld().getObjects(Picker.class);
        if (((GumballWorld)getWorld()).getCrankTurned()) {
            // Check if received coin is Quarter or not.
            if ( isQuarterCheck() ) {
                // Check whether List is not null or contains zero elements
                 if (alienPickerList != null && alienPickerList.size() > 0) {
                     //to pick a Random ALien to Distribute Gumball
                     //0 - RandomPicker and 1 - GreenPicker
                     alienPickerList.get(Greenfoot.getRandomNumber(alienPickerList.size())).pick();
                }
            }
        }        
    }
    
    /**
     * Function to Check whether received coin is Penny or Quarter.
     * If Quarter Received, check if it is Real or Fake.
     * @returns : True - if Quarter is valid
     *            False - if invalid coin(other then a valid quarter).
     */
    private boolean isQuarterCheck() {
        if ( ((GumballWorld)getWorld()).getCoin() instanceof Quarter ) {
            if ( ((GumballWorld)getWorld()).getCoin() instanceof FakeQuarter ) {
                 setValuesToRestartMachine() ;
                 return false ;
            } else {
                   return true ;   
            }
        } else if ( ((GumballWorld)getWorld()).getCoin() instanceof Penny ) {
            setValuesToRestartMachine() ;
            return false ;
        }
        return false ;
    }
    
    /**
     * Function to set values, this will ensure that when a Penny or Fake Qarter is received, the Gumball machine rejects it
     * and is ready to accept new coin.
     */
    private void setValuesToRestartMachine() {
        // Add Message of Invalid Coin for User
        ((GumballWorld)getWorld()).addObject(new InvalidCoin(), 375, 500) ;
        
        //Reset Value to accept Coin in Gumball machine.
        ((GumballWorld)getWorld()).setIsInValidCoinTrue() ;
        ((GumballWorld)getWorld()).setCrankTurnedfalse() ;
        ((GumballWorld)getWorld()).setAllowCoinTrue();
    }
}
