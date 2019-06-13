import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends WorldObject
{
    
    public abstract void touchPlayer(Player player);
    public abstract void walk();
    
    private boolean isTouching = false;
    public final void act() 
    {
        transform();
        walk();
        Player player = (Player)getOneIntersectingObject(Player.class);
        if(player != null)
        {
            if(!isTouching)
            {
                isTouching = true;
                touchPlayer(player);
            }
        }
        else
        {
            isTouching = false;
        }

    }   
    
    public void move(int amount)
    {
        int x = getX() + amount;
        int y = getY();
        
        setLocation(x, y);
    }
}
