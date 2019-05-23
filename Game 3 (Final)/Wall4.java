import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall4 extends Actor
{
    int speed = 5;

    public Wall4()
    {
        this(80,100);
    }

    public Wall4(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }

    public void act() 
    {
        GreenfootImage image = getImage();
        setLocation( getX()+ speed, getY());
    }        
}
