import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG extends World
{

    /**
     * Constructor for objects of class Loose.
     * 
     */
    public BG()
    {    
        super(1200, 600, 1); 
        Greenfoot.playSound("Clapping Sound Effect.wav");
        Greenfoot.playSound("Kids Cheering - Gaming Sound Effect (HD).wav");
        GGG end = new GGG();
        showText("RED TEAM WON ", 600, 200);
        addObject(end, 600, 300);
        Greenfoot.stop();
    }
}
