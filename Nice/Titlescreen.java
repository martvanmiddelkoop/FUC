import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titlescreen extends World
{
    Text text = new Text();
    Text text2 = new Text();
    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        super(600, 400, 1); 
        text.setText("Druk op ENTER om de game te starten" );
        addObject(text, 300, 100);
        
        text2.setText("Tip: vind de sleutel voor extra levens");
        addObject(text2, 300, 350);
        
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new Level1());
    }
    }
