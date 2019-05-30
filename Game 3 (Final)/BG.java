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
        Greenfoot.playSound("Sad Violin - MLG Sound Effects (HD).wav");
        String aa = MyWorld.getMainPoint();
        showText("You have made " + aa + " point for the game!", 600, 200);
        BGG end = new BGG();
        addObject(end, 600, 300);
        Greenfoot.stop();
    }
}
