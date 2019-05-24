import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall3 extends Actor
{
    int speed = (int)(Math.random()*(7))+3;

    public Wall3()
    {
        this(100,80);
    }

    public Wall3(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }

    public void act() 
    {
        GreenfootImage image = getImage();
        setLocation( getX(), getY() + speed);
    }         
}
