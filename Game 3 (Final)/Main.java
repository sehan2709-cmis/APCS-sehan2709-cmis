import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Actor
{
    private int score = 0;

    public void act() 
    {
        Animal animal = (Animal) getOneIntersectingObject(Animal.class);
        if((getOneIntersectingObject (Wall.class) != null) || (getOneIntersectingObject (Wall2.class) != null))
        {
            setLocation(400, 300);
        }
        else if((getOneIntersectingObject (Wall3.class) != null) || (getOneIntersectingObject (Wall4.class) != null))
        {
            setLocation(400, 300);
        }
        else if((getOneIntersectingObject (Enemy.class) != null))
        {
            setLocation(400, 300);
        }
        else if((getOneIntersectingObject (Catcher.class) != null))
        {
            setLocation(400, 300);
        }
        else if(getOneIntersectingObject (Animal.class) != null)
        {
            setLocation((int)(Math.random()*(350))+50, (int)(Math.random() * 500)+50);
            animal.setLocation((int)(Math.random() * 1000), (int)(Math.random() * 600));
            score += 1;
            MyWorld w = (MyWorld) getWorld();
            Enemy enemy = new Enemy(w.getTeamArea());
            getWorld().addObject(enemy, 800, 300);
        }
        else if(getOneIntersectingObject (Area.class) != null)
        {
            score += 2;
            setLocation(400, 300);
            MyWorld w = (MyWorld) getWorld();
            int y = (int)(Math.random() * 2)+1;
            for(int x = 0; x < y; x++)
            {
                Enemy enemy = new Enemy(w.getTeamArea());
                getWorld().addObject(enemy, 800, 300);
            }
        }
        getWorld().showText("Team Score: " + score, 100, 10);
        move();

        if(score == 10)
        {
            Greenfoot.setWorld(new GG());
        }
    }    

    public int getScore()
    {
        int x = score;
        return x;
    }

    public void setScore(int x)
    {
        score = x;
    }

    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("a") && getX() > 50)
        {
            x -= ((int)(Math.random() * 7));
        }
        if(Greenfoot.isKeyDown("d") && getX() < 1150)
        {
            x += ((int)(Math.random() * 7));
        }
        if(Greenfoot.isKeyDown("w") && getY() > 50)
        {
            y -= ((int)(Math.random() * 7));
        }
        if(Greenfoot.isKeyDown("s") && getY() < 550)
        {
            y += ((int)(Math.random() * 7));
        }
        setLocation(x,y);
    }
}
