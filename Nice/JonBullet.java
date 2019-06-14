import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JonBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JonBullet extends Dynamic
{
    /**
     * Act - do whatever the JonBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);

        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        if(enemy != null && !(enemy instanceof Bullet))
        {
            enemy.damage();
            getWorld().removeObject(this);
        }
    }    
}
