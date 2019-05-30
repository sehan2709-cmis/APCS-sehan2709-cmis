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
        MyWorld scre = (MyWorld) getWorld();
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
            World detect;
            detect = getWorld();
            detect.removeObject(Wall);
            detect.removeObject(Wall2);
            setLocation(400, 300);
        }
        else if((getOneIntersectingObject (Wall3.class) != null) || (getOneIntersectingObject (Wall4.class) != null))
        {
            World detect;
            detect = getWorld();
            detect.removeObject(Wall3);
            detect.removeObject(Wall4);
            setLocation(400, 300);
        }
        else if((getOneIntersectingObject (RedTeam.class) != null))
        {
            setLocation(400, 300);
        }
        else if((getOneIntersectingObject (Catcher.class) != null))
        {
            setLocation(400, 300);
            MyWorld w = (MyWorld) getWorld();
            int x = w.getRMain().getScore();
            if (x > 0)
            {
                w.getRMain().setScore(x-2);
            }
            else if( x < 0)
            {
                w.getRMain().setScore(0);
            }
        }
        else if(getOneIntersectingObject (Animal.class) != null)
        {
            setLocation(400, 300);
            MyWorld w = (MyWorld) getWorld();
            animal.setLocation((int)(Math.random() * 1000), (int)(Math.random() * 600));
            int x = w.getRMain().getScore();
            w.getRMain().setScore(x+2);
            if(scre.getMain().getScore() % 5 == 0)
            {
                RedTeam enemy = new RedTeam(w.getTeamArea());
                getWorld().addObject(enemy, 800, 300);
            }
        }
        else if(getOneIntersectingObject (Area.class) != null)
        {
            MyWorld w = (MyWorld) getWorld();
            int x = w.getRMain().getScore();
            w.getRMain().setScore(x+5);
            setLocation(400, 300);
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
            move((int)(Math.random() * 8));
            if(isAtEdge()){
                turnTowards(300,200);
                turn((int)(Math.random() * 360));
            }
        } else if (Math.random() > 0.5) {
            turnTowards(target.getX(), target.getY());
            if(!intersects(target) && ((getX() > 50 && getX() < 1150) && ( getY() > 50 && getY() < 550 )))
            {
                move((int)(Math.random() * 8));
            }
        }
    } 
}
