import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollingWorld here.
 * 
 * @author Bertie Wheen
 * @version 0.1
 */
public class Level extends World
{
    public Player player;
    public Dynamic dyn;
    
    public Level()
    {    
        super(600, 400, 1, false);
        player = new Player();
        addObject(player, 300, 354); //Creates the player.
        dyn = new Dynamic();
        addObject(dyn, 0, -10);
    }

    public Player getPlayer()
    {
        return player;
    }
    
    public Dynamic getDynamic()
    {
        return dyn;
    }
}