import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    int speed = (int)(Math.random()*(9))+3;

    public Wall()
    {
        this(100,80);
    }

    public Wall(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }

    public void act() 
    {
        GreenfootImage image = getImage();
        setLocation( getX(), getY()- speed);
    }      
}
