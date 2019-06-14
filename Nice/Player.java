import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player that user 'is'.
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public class Player extends Dynamic
{
    private float vSpeed = 0; //vertical speed  
    private float acceleration = 0.7f; //gravity effect while falling  
    private float jumpStrength = -15; 
    private boolean hasJumped = false;
    
    public void act()
    {
                checkFall();

        checkKeyPress();
        getShotByGarfield();
        
        if(getY() > getWorld().getHeight())
        {
            ((Level)getWorld()).lose();
        }
        
        
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
        
        if (Greenfoot.isKeyDown("space") && !hasJumped)
        {
            hasJumped = true;
            jump();
            fall();
            
        }
       
    }
  
    
    public void move(int amount)
    {
        int x = getX() + amount;
        int y = getY();
        
        setLocation(x, y);
    }
    
    public void jump()  
    {  
            
            vSpeed = jumpStrength;   
    } 
    
    public void fall()  
    {  
        setLocation(getX(),  getY() + (int)vSpeed);  
        vSpeed = vSpeed + acceleration;  
    }  

    public boolean onPlatform()  
    {  
       Actor block = getOneIntersectingObject(Block.class);
        if(block != null)
        {
            if(getY() + getImage().getHeight() / 2 > block.getY())
            {
                //if bottom
                if(getY() < block.getY() + block.getImage().getHeight() / 2)
                {
                    //setLocation(getX(), block.getY() + block.getImage().getHeight());
                    vSpeed = 2;
                }
                if(getX() + getImage().getWidth() < block.getX() + 10)
                {//if left
                    setLocation(block.getX() - block.getImage().getWidth() / 2 - getImage().getWidth() / 2 - 2, getY());
                }
                if(getX() > block.getX() + 10)
                {//if right
                    setLocation(block.getX() + block.getImage().getWidth() / 2 + getImage().getWidth() / 2  + 2 , getY());
                }
                return false;

            }
            else
            {
                setLocation(getX(), block.getY() - block.getImage().getHeight() / 2 - getImage().getHeight() / 2 + 1);
                hasJumped = false;
            }
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
    
    private int health = 3;
    
    public int getHealth()
    {
        return health;
    }
    
    public void damage(int hp)
    {
            ((Level)getWorld()).damage();
    }
    
    public void getShotByGarfield()
    {
        if(isTouching(Bullet.class))
        {
            Greenfoot.setWorld(new Level3());
        }
    }
}
