import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Garfield extends Enemy
{
    public Garfield()
    {
        health = 200;
    }
    
    public void touchPlayer(Player player)
    {
        player.damage(1);
        if(stop)
        {
            setLocation(recX, getY());
            stop = false;
            setRotation(0);
        }
    }
    private boolean stop = false;
    private int recX = 0;

    public void walk()
    {
     checkKeys();
     if(stop == true)
     {
         specialAttack();
     }
     
     
}

     public void die()
     {
         getWorld().addObject(new Finish(), getX(), getY());
         super.die();
     }

public void checkKeys()
{
    if(Greenfoot.getRandomNumber(500) < 5)
    {
        shoot();
    }
    else if(Greenfoot.getRandomNumber(500) < 1)
    {
        stop = true;
        recX = getX();
    }
    
}

public void shoot()
{
    getWorld().addObject(new Bullet(), getX(), getY());
}

public void specialAttack ()
    {

    move(-4);
    turn(20);
    
    if(atWorldEdge())
    {
        setLocation(recX, getY());
        stop = false;
        setRotation(0);
    }
}

public boolean atWorldEdge()
{
    return getX() < 0;
}
}
