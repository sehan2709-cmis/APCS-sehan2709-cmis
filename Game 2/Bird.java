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

    public Bird()
    {
        this(75,55);
    }
    
    public Bird(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }

    public void act() 
    {
        setLocation( (int)(getX()), (int)(getY() + dy));

        if(getOneIntersectingObject (Tree.class) != null)
        {
            GameOver end = new GameOver();
            getWorld().addObject(end, getWorld().getWidth() / 2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        
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
        if (getY() > getWorld().getHeight()-120)
        {
            GameOver end = new GameOver();
            getWorld().addObject(end, getWorld().getWidth() / 2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        else if(getY() < -30)
        {
            GameOver end = new GameOver();
            getWorld().addObject(end, getWorld().getWidth() / 2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }

        dy = dy+ g;
    }    
}
