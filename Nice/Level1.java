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
        for(int i = 0; i < 50; i++)
        {
            Block block = new Block();

            switch(i)
            {
                
                case 30:
                case 31:
                case 32:
                case 33:
                case 16:
                case 15:
                    break;
                case 14:
                case 13:
                case 12:
                case 10:
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - 200);
                default:
                    addObject(block, i * block.getImage().getWidth(), getHeight());
                    break;
            }
            
            
            
        }
    }
}
