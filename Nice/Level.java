import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
import java.text.*;
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
    protected static int score = 100;
    
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
        Score s = new Score();
        s.setText("Score: " + score);
        addObject(s, getWidth() - s.getImage().getWidth() / 2 - 20, 30);
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void addScore(int amount)
    {
        score += amount;
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
        score -= 20;
        Greenfoot.setWorld(clone());
    }
    
    public void win()
    {
        try(FileWriter fw = new FileWriter("score.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw))
        {
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");  
            Date date = new Date(System.currentTimeMillis());  
            out.println("Score: " + score + " Datum: "+ formatter.format(date));
        } 
        catch (IOException e) 
        {
        }
        
        setPopup("Gewonnen! :)");
        while(true)
        {
            Greenfoot.delay(1);
        }
    }
    
    public void finish()
    {
        Level l = getNext();
        if(l == null)
        {
            win();
        }
        else
        {
            Greenfoot.setWorld(getNext());
        }
    }
}