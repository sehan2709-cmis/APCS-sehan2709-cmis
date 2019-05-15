import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Sehan) 
 * @version (0.1)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(1000, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Egg egg = new Egg();
        addObject(egg,107,306);
        WBCell jumper = new WBCell();
        addObject(jumper,230,372);
        egg.setLocation(94,366);
        sperm ang = new sperm();
        addObject(ang, 0, 0);
        removeObject(egg);
        removeObject(ang);
        jumper.setLocation(230,372);
        jumper.setLocation(11,549);
        sperm ang2 = new sperm();
        addObject(ang2,322,388);
        removeObject(jumper);
        WBCell wbcell2 = new WBCell();
        addObject(wbcell2,48,325);
        Egg egg2 = new Egg();
        addObject(egg2,643,214);
    }
}
