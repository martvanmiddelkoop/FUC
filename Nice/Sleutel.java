import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sleutel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sleutel extends WorldObject
{
    /**
     * Act - do whatever the Sleutel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        transform();
        Player player = (Player)getOneIntersectingObject(Player.class);
        if(player != null)
        {
            ((Level2)getWorld()).setKeyCollected();
            ((Level2)getWorld()).setPopup("Sleutel verzameld");
            getWorld().removeObject(this);

        }
    }    
}
