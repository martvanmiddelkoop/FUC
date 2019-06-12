import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        for(int i = 0; i < 10; i++)
        {
            Block block = new Block();
            addObject(block, i * block.getImage().getWidth(), getHeight());
        }
    }
}
