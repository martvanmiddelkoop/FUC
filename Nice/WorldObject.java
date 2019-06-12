import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The superclass of all actors that need to scroll (i.e. all the actors except Player)
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public class WorldObject extends Dynamic
{
    public int scrollX; //The variable used when scrolling.

    public WorldObject()
    {
        scrollX = 0;
    }

    /**
     * Used for setting the actor's location.
     */
    public void setLocation()
    {
        setLocation(getX() + scrollX, getY());
    }
    
    /**
     * This is used for responding to keyboard input by the user.
     * This will only happen when the player is far enough to the left or right of the screen for scrolling to be needed.
     * @param How fast the scrolling should be. 3-4 is recommended. If a negative value is used, the controls will be inverted.
     */
    public void checkKeyPress(int amount)
    {
        Level world = (Level) getWorld();
        Dynamic dyn = (Dynamic) world.getDynamic();
        if(Greenfoot.isKeyDown("left") && dyn.shouldScroll == true)
        {
            scrollX = amount;
        }
        else if(Greenfoot.isKeyDown("right") && dyn.shouldScroll == true)
        {
            scrollX = -amount;
        }
        else
        {
            scrollX = 0;
        }
    }
    
    /**
     * A call to the following should be in all scrolling actor's act methods.
     */
    public void transform()
    {
        checkKeyPress(3);
        setLocation();
    }
}
