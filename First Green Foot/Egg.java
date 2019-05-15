import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    public void act()
    {
        if(isTouching(sperm.class)){
            setLocation((int)(Math.random() * 1000), (int)(Math.random() * 600));
        }
    }
}

