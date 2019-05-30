import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    int speed = (int)(Math.random()*(9))+3;

    public Wall()
    {
        this(100,80);
    }

    public Wall(int w, int h)
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
        setLocation( getX(), getY()- speed);
    }      
}
