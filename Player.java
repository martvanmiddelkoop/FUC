import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Popetje
{
    private int ySpeed = 0;
    public void act() 
    {
        if (Greenfoot.isKeyDown("a"))
        { 
            move(-4); 
        }
        if (Greenfoot.isKeyDown("d"))
        { 
            move(4); 
        }
        
        int groundLevel = getWorld().getHeight() / 2 - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        if (!onGround) // in middle of jump
        {
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
        }
        else // on ground
        {
            if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -15; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
            }
        }
    }    
}
