import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends WorldObject
{
    
    public void act() 
    {
        
        transform();
        Player player = (Player)getOneIntersectingObject(Player.class);
        if(player != null)
        {
            ((Level)getWorld()).finish();
        }
    }    
}
