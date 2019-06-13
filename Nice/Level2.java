import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{

    protected Level clone()
    {
        return new Level2();
    }
    
    protected Level getNext()
    {
        return new Level3();
    }
    
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        for(int i = 0; i < 65; i++)
        {
            SteenBlock block = new SteenBlock();

            switch(i)
            {
                
             
                
               case 13:
               break;
                
                case 14:
                
                case 15:
                                    addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                break;
                case 16:
                case 17:
                break;
                
                case 18:
                                addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                case 19:  
                                addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                 break;  
                 case 20:
                 case 21:
                 break;
                 case 22:
                                addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                 case 23:
                                addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                 break;               
                 case 24:
                 case 25:
                 break;
                 case 26:
                                addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                 break;
                 
                 case 27:
                 case 28:
                 break;
                 case 29:
                                addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                 break;
                 
                 case 30:
                 case 31:
                 break;
                 case 32:
                                addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                 break;
                 
                 case 33:
                 break;
                 
                 case 36:
                 case 37:
                 break;         
                 case 38:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                 break;
                 case 39:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                  break;
                  
                  case 40:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                  break;
                  case 41:
                  case 42:
                  break;
                  case 46:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                  break;
                  case 47:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                  break;
                  case 48:
                  break;
                  case 52:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                  break;
                  case 53:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                  break;
                  case 54:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight());
                  break;
                  
                  case 55:
                  case 56:
                  case 57:
                            addObject(block, i * block.getImage().getWidth(), getHeight() - block.getImage().getHeight() * 2);
                  break;
                  case 58:
                  case 59:
                            
                default:
                    addObject(block, i * block.getImage().getWidth(), getHeight());
                    break;
                }
        }
    }
}
