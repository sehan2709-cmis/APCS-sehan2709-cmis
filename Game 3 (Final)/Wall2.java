import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall2 extends Actor
{
    int speed = 5;

    public Wall2()
    {
        this(80,100);
    }

    public Wall2(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }

    public void act() 
    {
        GreenfootImage image = getImage();
        setLocation( getX()- speed, getY());
    }        
}
