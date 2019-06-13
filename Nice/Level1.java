 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    
    protected Level clone()
    {
        return new Level1();
    }
    
    protected Level getNext()
    {
        return new Level2();
    }
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        for(int i = 0; i < 100; i++)
        {
            Block block = new Block();

            switch(i)
            {
                
                case 30:
                case 31:
                case 33:
                case 16:
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 56:
                case 57:
                case 59:
                case 61:
                case 62:
                case 71:
                case 72:
                case 73:
                
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                    break;
                case 14:
                case 13:
                case 12:
                case 10:
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 3);
                default:
                    addObject(block, i * block.getImage().getWidth(), getHeight());
                    break;
            }
            
            
            switch(i)
            {
                case 35:
                case 22:
                case 21:
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                    break;
                case 37:
                case 81:
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 3);
                    break;
                case 39:
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 4);
                    break;
                    
                case 72:
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 1);
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                    addObject(new Block(), i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 3);

                    break;

            }
            
            switch(i)
            {
                case 3:
                case 10:
                case 27:
                case 75:
                case 44:
                case 68:
                Goomba g = new Goomba();
                    addObject(g, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                    break;

            }
            
            
            
        }
    }
}
