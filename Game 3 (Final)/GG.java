import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GG extends World
{
    
    public GG()
    {    
        super(1200, 600, 1); 
        Greenfoot.playSound("Clapping Sound Effect.wav");
        Greenfoot.playSound("Kids Cheering - Gaming Sound Effect (HD).wav");
        GGG end = new GGG();
        addObject(end, 600, 300);
        String aa = MyWorld.getMainPoint();
        showText("You have made " + aa + " point for the game!", 600, 200);
        Greenfoot.stop();
    }
}
