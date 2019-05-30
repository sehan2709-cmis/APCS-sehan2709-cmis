import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall3 extends Actor
{
    int speed = (int)(Math.random()*(7))+3;

    public Wall3()
    {
        this(100,80);
    }

    public Wall3(int w, int h)
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
        Enemy = getOneObjectAtOffset(0, 0, RedTeam.class);

        if(getOneIntersectingObject (Team.class) != null)
        {
            World detect;
            detect = getWorld();
            detect.removeObject(Team);
            setLocation(400, 300);
            MyWorld w = (MyWorld) getWorld();
            int x = w.getMain().getScore();
            if (x > 0)
            {
                w.getMain().setScore(x-1);
            }
            else if( x < 0)
            {
                w.getMain().setScore(0);
            }
        }
        else if(getOneIntersectingObject (RedTeam.class) != null)
        {
            World detect;
            detect = getWorld();
            detect.removeObject(Enemy);
            setLocation(400, 300);
            MyWorld w = (MyWorld) getWorld();
            int x = w.getRMain().getScore();
            if (x > 0)
            {
                w.getRMain().setScore(x-1);
            }
            else if( x < 0)
            {
                w.getRMain().setScore(0);
            }
        }
        GreenfootImage image = getImage();
        setLocation( getX(), getY() + speed);
    }         
}
