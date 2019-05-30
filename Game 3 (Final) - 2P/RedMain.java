import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedMain extends Actor
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
            setLocation(800, 300);
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
            setLocation(800, 300);
            if (score > 0)
            {
                score -= 2;
            }
        }
        else if((getOneIntersectingObject (Main.class) != null) || (getOneIntersectingObject (Team.class) != null))
        {
            Greenfoot.playSound("Punch sound effect 2.wav");
            setLocation(800, 300);
        }
        else if((getOneIntersectingObject (Catcher.class) != null))
        {
            Greenfoot.playSound("Punch sound effect 2.wav");
            setLocation(800, 300);
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
            setLocation(800, 300);
            animal.setLocation((int)(Math.random() * 1000), (int)(Math.random() * 600));
            score += 2;
            if(scre.getRMain().getScore() % 5 == 0)
            {
                Team enemy = new Team(scre.getArea());
                getWorld().addObject(enemy, 400, 300);
            }
        }
        else if(getOneIntersectingObject (TeamArea.class) != null)
        {
            score += 5;
            setLocation(800, 300);
            MyWorld w = (MyWorld) getWorld();
            Team enemy = new Team(scre.getArea());
                getWorld().addObject(enemy, 400, 300);
        }
        getWorld().showText("Red Team Score: " + score, 1100, 10);
        move();

        if(score >= 30)
        {
            Greenfoot.setWorld(new BG());
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
        if(Greenfoot.isKeyDown("left") && getX() > 50)
        {
            x -= ((int)(Math.random() * 7));
        }
        if(Greenfoot.isKeyDown("right") && getX() < 1150)
        {
            x += ((int)(Math.random() * 7));
        }
        if(Greenfoot.isKeyDown("up") && getY() > 50)
        {
            y -= ((int)(Math.random() * 7));
        }
        if(Greenfoot.isKeyDown("down") && getY() < 550)
        {
            y += ((int)(Math.random() * 7));
        }
        setLocation(x,y);
    }
}
