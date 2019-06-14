import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Enemy
{
    
    public void touchPlayer(Player player)
    {
        player.damage(1);
        getWorld().removeObject(this);
    }

    public void walk() 
    {
        move(-5);
    } 
}
