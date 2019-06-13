import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class ScrollingWorld here.
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public class Level extends World
{
    private Player player;
    private Dynamic dyn;
    private int coinsCollected = 0;
    
    public Level()
    {    
        super(600, 400, 1, false);
        player = new Player();
        addObject(player, 300, 100); //Creates the player.
        dyn = new Dynamic();
        addObject(dyn, 0, -10);
    }
    
    public Actor findActor(Actor find)
{
    ArrayList<Actor> actors= (ArrayList<Actor>)getObjects(Actor.class);
 
    for (Actor a : actors)
        if(a.equals(find))
             return a;
    return null;
}

    public Player getPlayer()
    {
         
        return  findActor(player) != null ? player : null;
    }
    
    public Dynamic getDynamic()
    {
        return dyn;
    }
}