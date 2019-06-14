import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Garfield extends Enemy
{
    public void touchPlayer(Player player){}
    public boolean stop = true;


    public void walk()
{
     checkKeys();
     if(stop == true)
     {
         specialAttack();
     }
     
     
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
    }
    
}

public void shoot()
{
    getWorld().addObject(new Bullet(), getX(), getY());
}

public void specialAttack ()
    {

    move(-4);
    turn(Greenfoot.getRandomNumber(90));
    
    if(atWorldEdge())
    {
        setLocation(500, 300);
        stop = false;
        setRotation(0);
    }
}

public boolean atWorldEdge()
{
if (getX() <= 5 || getX() >= getWorld() . getWidth() -5)
        return true;
    if (getY() <= 5 || getY() >= getWorld() . getHeight() -5) 
        return true;
    else
        return false;
}
}
