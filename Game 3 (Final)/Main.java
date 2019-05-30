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
        MyWorld scre = (MyWorld) getWorld();
        
        if (score < 1)
            {
                score = 0;
            }
        
        Actor Wall;
        Actor Wall2;
        Actor Wall3;
        Actor Wall4;

        Wall = getOneObjectAtOffset(0, 0, Wall.class);
        Wall2 = getOneObjectAtOffset(0, 0, Wall2.class);
        Wall3 = getOneObjectAtOffset(0, 0, Wall3.class);
        Wall4 = getOneObjectAtOffset(0, 0, Wall4.class);

        if((getOneIntersectingObject (Wall.class) != null) || (getOneIntersectingObject (Wall2.class) != null))
        {
            Greenfoot.playSound("Punch sound effect 2.wav");
            World detect;
            detect = getWorld();
            detect.removeObject(Wall);
            detect.removeObject(Wall2);
            setLocation(400, 300);
            if (score > 0)
            {
                score -= 2;
            }
        }
        else if((getOneIntersectingObject (Wall3.class) != null) || (getOneIntersectingObject (Wall4.class) != null))
        {
            Greenfoot.playSound("Punch sound effect 2.wav");
            World detect;
            detect = getWorld();
            detect.removeObject(Wall3);
            detect.removeObject(Wall4);
            setLocation(400, 300);
            if (score > 0)
            {
                score -= 2;
            }
        }
        else if((getOneIntersectingObject (Enemy.class) != null))
        {
            Greenfoot.playSound("Punch sound effect 2.wav");
            setLocation(400, 300);
        }
        else if((getOneIntersectingObject (Catcher.class) != null))
        {
            Greenfoot.playSound("Punch sound effect 2.wav");
            setLocation(400, 300);
            if (score > 0)
            {
                score -= 2;
            }
            else if( score < 0)
            {
                score = 0;
            }
        }
        else if(getOneIntersectingObject (Animal.class) != null)
        {
            Greenfoot.playSound("MAGIC WAND - sound effect.wav");
            setLocation(400, 300);
            animal.setLocation((int)(Math.random() * 1000), (int)(Math.random() * 600));
            score += 2;
            if(scre.getScore().getEscore()%4 == 0)
            {
                Enemy enemy = new Enemy(scre.getTeamArea());
                getWorld().addObject(enemy, 800, 300);
            }
        }
        else if(getOneIntersectingObject (Area.class) != null)
        {
            score += 5;
            setLocation(400, 300);
            MyWorld w = (MyWorld) getWorld();
        }
        getWorld().showText("Team Score: " + score, 100, 10);
        move();

        if(score >= 30)
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
