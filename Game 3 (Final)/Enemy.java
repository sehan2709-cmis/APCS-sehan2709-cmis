import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private Actor target;
    private boolean wandering = true;

    public Enemy(Actor target){
        this.target = target;
    }

    public void act() 
    {
        Animal animal = (Animal) getOneIntersectingObject(Animal.class);
        Catcher catchh = (Catcher) getOneIntersectingObject(Catcher.class);
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
        }
        else if((getOneIntersectingObject (Wall3.class) != null) || (getOneIntersectingObject (Wall4.class) != null))
        {
            World detect;
            detect = getWorld();
            detect.removeObject(Wall3);
            detect.removeObject(Wall4);
        }
        else if((getOneIntersectingObject (Catcher.class) != null))
        {
            setLocation(800, 300);
            int x = scre.getEMain().getScore();
            catchh.setLocation((int)(Math.random() * 1000)+50, (int)(Math.random() * 600)+50);
            if (x > 0)
            {
                scre.getMain().setScore(x-1);
            }
            else if( x < 0)
            {
                scre.getMain().setScore(0);
            }
        }
        else if(getOneIntersectingObject (Animal.class) != null)
        {
            setLocation(800, 300);
            animal.setLocation((int)(Math.random() * 1000), (int)(Math.random() * 600));
            int x = scre.getEMain().getScore();
            scre.getEMain().setScore(x+1);
            Team enemy = new Team(scre.getArea());
                getWorld().addObject(enemy, 400, 300);
        }
        else if(getOneIntersectingObject (TeamArea.class) != null)
        {
            setLocation(800, 300);
            int x = scre.getEMain().getScore();
            scre.getEMain().setScore(x+3);
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
