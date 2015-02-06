import greenfoot.*;

/**
 * Description of class Coin.
 * his classis used to get info of Coin being moved around in GumballWorld.
 * @author Vipul Kanade
 * @version (02/01/2015)
 */
public class Coin extends Actor
{
   /**
    * Act - This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
    * This method uses Greenfoot.mouseDragged(Object) to get info of Coin being moved around in GumballWorld
    */
    public void act() 
    {
        int mouseX, mouseY ;
        //Check if mouse is being moved
        if(Greenfoot.mouseDragged(this)) {
            //Return a mouse info object with information about the state of the mouse
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            //set location X and Y Coordinate of mouse.
            setLocation(mouseX, mouseY);  
        }
   }    
}
