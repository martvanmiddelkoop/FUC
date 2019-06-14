import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Text
{
    
    private int duration  = 50;
    private int current = duration;
    
    public void act() 
    {
        setText("Score: " + ((Level)getWorld()).getScore());
        
        if(current <= 0)
        {
            ((Level)getWorld()).addScore(-1);
            current = duration;
        }
        else
        {
            current--;
        }
    }    
}
