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
        Character character = new Character();
        addObject(character,107,306);
        Jumper jumper = new Jumper();
        addObject(jumper,230,372);
        character.setLocation(94,366);
        Ang ang = new Ang();
        addObject(ang, 0, 0);
        removeObject(character);
        removeObject(ang);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(230,372);
        jumper.setLocation(11,549);
    }
}
