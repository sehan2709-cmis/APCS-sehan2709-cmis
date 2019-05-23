import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rearea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rearea extends Actor
{
    public Rearea()
    {
        this(100,100);
    }
    
    public Rearea(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
