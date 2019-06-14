import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shatkist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shatkist extends WorldObject
{
    /**
     * Act - do whatever the Shatkist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        transform();

        Player player = (Player)getOneIntersectingObject(Player.class);
        if(player != null)
        {
            if(((Level2)getWorld()).isKeyCollected())
            {
                ((Level2)getWorld()).setPopup("Schatkist verzameld");
                ((Level)getWorld()).addScore(200);
                getWorld().removeObject(this);
            }
            else
            {
                ((Level2)getWorld()).setPopup("Vind de sleutel om de schatkist te openen");
            }
            
        }
            
        
    }    
}
