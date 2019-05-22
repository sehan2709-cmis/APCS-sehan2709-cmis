import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Actor
{
    public void act() 
    {
        move();
    }    
    
    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("a"))
        {
            x -= 5;
        }
        if(Greenfoot.isKeyDown("d"))
        {
            x += 5;
        }
        if(Greenfoot.isKeyDown("w"))
        {
            y -= 5;
        }
        if(Greenfoot.isKeyDown("s"))
        {
            y += 5;
        }
        setLocation(x,y);
    }
}
