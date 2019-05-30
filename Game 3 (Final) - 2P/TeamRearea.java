import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeamRearea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeamRearea extends Actor
{
    public TeamRearea()
    {
        this(100,100);
    }
    
    public TeamRearea(int w, int h)
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
