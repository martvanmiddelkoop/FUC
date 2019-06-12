import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player that user 'is'.
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public class Player extends Dynamic
{
    private int vSpeed = 0; //vertical speed  
    private int acceleration = 2; //gravity effect while falling  
    private int jumpStrength = -8; 
    
    public void act()
    {
        checkKeyPress();
        checkFall();
        jump();
        handleCollision();
    }
    
    public void checkKeyPress()
    {
        Level world = (Level) getWorld();
        Dynamic dyn = (Dynamic) world.getDynamic();
        if(Greenfoot.isKeyDown("left") && dyn.shouldScroll == false)
        {
            move(-3 * 2);
        }
        else if(Greenfoot.isKeyDown("right") && dyn.shouldScroll == false)
        {
            move(3 * 2);
        }
        
        if (Greenfoot.isKeyDown("space") && onPlatform())
        {
            jump();
        }
    }
    
    public void handleCollision()
    {
 
    }
    
    public void move(int amount)
    {
        int x = getX() + amount;
        int y = getY();
        
        setLocation(x, y);
    }
    
    public void jump()  
    {  
        if (Greenfoot.isKeyDown("space"))  
        {  
            vSpeed = jumpStrength;  
            fall();  
        }  
    } 
    
    public void fall()  
    {  
        setLocation(getX(), getY()+vSpeed);  
        vSpeed = vSpeed + acceleration;  
    }  

    public boolean onPlatform()  
    {  
       Actor block = getOneIntersectingObject(Block.class);
        if(block != null)
        {
            setLocation(getX(), block.getY() - block.getImage().getHeight() / 2 - getImage().getHeight() / 2 + 1); 
            return true;
        }
        return false;
    }  

    public void checkFall()  
    {  
        if (onPlatform())  
        {  
            vSpeed = 0;  
        }  
        else  
        {  
            fall();  
        }  
    }
}
