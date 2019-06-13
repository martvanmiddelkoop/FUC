import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Garfield extends Enemy
{
    public void touchPlayer(Player player){}


    public void walk()
{
     checkKeys();
}

public void checkKeys()
{
    if(Greenfoot.getRandomNumber(500) < 5)
    {
        shoot();
    }
}

public void shoot()
{
    getWorld().addObject(new Bullet(), getX(), getY());
}


}
