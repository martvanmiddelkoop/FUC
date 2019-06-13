import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    
    public void setText(String text)
    {
         setImage(new GreenfootImage(text, 30, Color.WHITE, Color.BLACK));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
