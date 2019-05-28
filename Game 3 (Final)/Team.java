import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team extends Actor
{
    private Actor target;
    private boolean wandering = true;
    
    public Team(Actor target){
        this.target = target;
    }

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
            Victory end = new Victory();
            getWorld().addObject(end, getWorld().getWidth() / 2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        
        wandering = Math.random() > .99 ? !wandering : wandering;
        if(target == null || wandering){
            if(Math.random() > 0.4){
                if(Math.random() > 0.5){
                    turn(-(int)(Math.random() * 45));
                }else{
                    turn((int)(Math.random() * 45));
                }
            }
            move((int)(Math.random() * 5));
            if(isAtEdge()){
                turnTowards(300,200);
                turn((int)(Math.random() * 360));
            }
        } else if (Math.random() > 0.5) {
            turnTowards(target.getX(), target.getY());
            if(!intersects(target) && ((getX() > 50 && getX() < 1150) && ( getY() > 50 && getY() < 550 )))
            {
                move((int)(Math.random() * 5));
            }
        }
    } 
}
