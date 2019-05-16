import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    double dy = 0;
    double g = 0.9;
    double speed = -9;

    /**
     * Act - do whatever the Brid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( (int)(getX()), (int)(getY() + dy));

        if(Greenfoot.isKeyDown("space"))
        {
            dy = speed;
        }

        if(-15 < dy && dy < 0)
        {
            setRotation((int)(dy));
        }
        else
        {
            setRotation((int)(dy * 2.9));
        }
        if (getY() > getWorld().getHeight())
        {
            GameOver end = new GameOver();
            getWorld().addObject(end, getWorld().getWidth() / 2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }

        dy = dy+ g;
    }    
}
