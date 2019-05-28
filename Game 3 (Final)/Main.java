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
            setLocation((int)(Math.random()*(1000))+50, (int)(Math.random() * 500)+50);
            animal.setLocation((int)(Math.random() * 1000), (int)(Math.random() * 600));
        }
        else if(getOneIntersectingObject (Area.class) != null)
        {
            score++;
            setLocation(800, 300);
            Enemy head = new Enemy(TeamArea.class);
            addObject(head, 800, 300);
            Catcher catcher = new Catcher(head);
            addObject(catcher, 50, 50);
        }
        getWorld().showText("Team Score: " + score, 100, 10);
        move();

        if(score == 4)
        {
            Victory end = new Victory();
            getWorld().addObject(end, getWorld().getWidth() / 2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }    

    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("a") && getX() > 50)
        {
            x -= ((int)(Math.random() * 5));
        }
        if(Greenfoot.isKeyDown("d") && getX() < 1150)
        {
            x += ((int)(Math.random() * 5));
        }
        if(Greenfoot.isKeyDown("w") && getY() > 50)
        {
            y -= ((int)(Math.random() * 5));
        }
        if(Greenfoot.isKeyDown("s") && getY() < 550)
        {
            y += ((int)(Math.random() * 5));
        }
        setLocation(x,y);
    }
}
