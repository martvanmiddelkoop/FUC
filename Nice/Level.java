import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class ScrollingWorld here.
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public abstract class Level extends World
{
    private Player player;
    private Dynamic dyn;
    private int coinsCollected = 0;
    private static Text lives = new Text();
    private int health = 3;
    private Popup popup = new Popup();
    
    public Level()
    {    
        super(600, 400, 1, false);
        player = new Player();
        addObject(player, 300, 100); //Creates the player.
        dyn = new Dynamic();
        addObject(dyn, 0, -10);
        addObject(lives, 0, 0);
        lives.setText("HP: " + player.getHealth() + "");
        lives.setLocation(lives.getImage().getWidth(), 30);
        addObject(popup, 0,0);
    }
    
    protected abstract Level clone();
    protected abstract Level getNext();
    
    public Actor findActor(Actor find)
    {
    ArrayList<Actor> actors= (ArrayList<Actor>)getObjects(Actor.class);
 
    for (Actor a : actors)
        if(a.equals(find))
             return a;
    return null;
    }
    
    public void setPopup(String text)
    {
        popup.setText(text);
    }
    
    public void damage()
    {
        health--;

        lives.setText("HP: "+health + "");
        
        if(health <= 0)
        {
            Greenfoot.setWorld(clone());
        }

    }

    public Player getPlayer()
    {
         
        return  findActor(player) != null ? player : null;
    }
    
    public Dynamic getDynamic()
    {
        return dyn;
    }
    
    public void lose()
    {
        Greenfoot.setWorld(clone());
    }
    
    public void finish()
    {
        Greenfoot.setWorld(getNext());
    }
}