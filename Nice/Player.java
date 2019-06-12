import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player that user 'is'.
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public class Player extends Dynamic
{
    public void act()
    {
        checkKeyPress();
        handleCollision();
    }
    
    public void checkKeyPress()
    {
        Level world = (Level) getWorld();
        Dynamic dyn = (Dynamic) world.getDynamic();
        if(Greenfoot.isKeyDown("left") && dyn.shouldScroll == false)
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right") && dyn.shouldScroll == false)
        {
            move(3);
        }
    }
    
    public void handleCollision()
    {
        Actor block = getOneIntersectingObject(Block.class);
        if(block != null)
        {
            getWorld().removeObject(block);
        }
    }
    
    public void move(int amount)
    {
        int x = getX() + amount;
        int y = getY();
        
        setLocation(x, y);
    }
}
