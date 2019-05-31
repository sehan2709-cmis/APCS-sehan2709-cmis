import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall2 extends Actor
{
    int speed = (int)(Math.random()*(20))+4;

    public Wall2()
    {
        this(80,100);
    }

    public Wall2(int w, int h)
    {
        GreenfootImage image = getImage();
        image.scale(w,h);
        setImage(image);
    }

    public void act() 
    {
        
        MyWorld scre = (MyWorld) getWorld();

        Actor Team;
        Actor Enemy;

        Team = getOneObjectAtOffset(0, 0, Team.class);
        Enemy = getOneObjectAtOffset(0, 0, Enemy.class);

        if(getOneIntersectingObject (Team.class) != null)
        {
            World detect;
            detect = getWorld();
            detect.removeObject(Team);
        }
        else if(getOneIntersectingObject (Enemy.class) != null)
        {
            World detect;
            detect = getWorld();
            detect.removeObject(Enemy);
        }
        GreenfootImage image = getImage();
        setLocation( getX()- speed, getY());
    }        
}
