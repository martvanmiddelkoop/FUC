import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goomba extends Enemy
{
    public void touchPlayer(Player player)
    {
        getWorld().removeObject(player);
    }
    
    int dist = 0;
    int target = 100;
    int dir = 1;
    public void walk()
    {
        if((dist > target && target > 0) || (dist < target && target < 0) )
        {
            target *= -1;
            dir *= -1;
        }
        
        dist += 1 * dir;
        move(1 * dir);
    }
   

}
