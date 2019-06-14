import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Popup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Popup extends Text
{
    private final int duration = 50;
    
    public void setText(String text)
    {
        super.setText(text);
        
        setLocation(getWorld().getWidth() / 2,getWorld().getHeight() / 2);
        
        currentTime = duration;
    }
    
    private int currentTime = 0;
    
    public void act() 
    {
        if(currentTime <= 0)
        {
            setLocation(-100, -100);
        }
        else
        {
            currentTime--;
        }
    }    
}
