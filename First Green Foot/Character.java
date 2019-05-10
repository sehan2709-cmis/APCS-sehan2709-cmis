import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    public void act()
    {
        move();
    }
    
    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("w"))
        {
            y-= 4;
        }
        if(Greenfoot.isKeyDown("a"))
        {
            x-= 4;
        }
        if(Greenfoot.isKeyDown("s"))
        {
            y+=4 ;
        }
        if(Greenfoot.isKeyDown("d"))
        {
            x+=4 ;
        }
        setLocation(x,y);
    }  
}

