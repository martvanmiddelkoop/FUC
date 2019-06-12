import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player that user 'is'.
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public class Player extends Dynamic
{
    private int speed = 2; //movement speed  
    private int vSpeed = 0; //vertical speed  
    private int acceleration = 2; //gravity effect while falling  
    private int jumpStrength = -8; 
    
    public void act()
    {
        checkKeyPress();
        checkFall();
        jump();//This should be included in the act() method so that the game is always checking for user input.
        //Methods such as shooting a gun go here.
    }
    
    /**
     * This is used for responding to keyboard input by the user.
     * This will only happen when the player is far enough to the left or right of the screen for scrolling to be needed.
     */
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
        
        if (Greenfoot.isKeyDown("space") && onPlatform())
        {
            jump();
        }
    }
    
    /**
     * This method will make the player move right a certain amount.
     * Entering a negative amount will cause a movement towards the left.
     * @param The speed of the movement
     */
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
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, World.class);  
        return under != null;  
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
