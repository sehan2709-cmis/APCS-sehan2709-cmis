import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ang extends Actor
{
    public Ang()
    {
        this(100,25);
    }
    
    public Ang(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(-10);
        }
        move(1);
    }    
}
