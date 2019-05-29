import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GG extends World
{

    /**
     * Constructor for objects of class GG.
     * 
     */
    public GG()
    {    
        super(1200, 600, 1); 
        GGG end = new GGG();
        addObject(end, 600, 300);
        Greenfoot.stop();
    }
}
