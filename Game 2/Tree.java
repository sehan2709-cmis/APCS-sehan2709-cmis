import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{
    int speed = 4;
    public Tree()
    {
        this(80,500);
    }
    
    public Tree(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }
    
    
    public void act() 
    {
        GreenfootImage image = getImage();
        setLocation( getX() - speed, getY());
        
    }    
}
