import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int escore = 0;
    private Actor target;
    private boolean wandering = true;
    public Enemy(Actor target){
        this.target = target;
    }

    public void act() 
    {
        Animal animal = (Animal) getOneIntersectingObject(Animal.class);
        if((getOneIntersectingObject (Wall.class) != null) || (getOneIntersectingObject (Wall2.class) != null))
        {
            setLocation(800, 300);
        }
        else if((getOneIntersectingObject (Wall3.class) != null) || (getOneIntersectingObject (Wall4.class) != null))
        {
            setLocation(800, 300);
        }
        else if((getOneIntersectingObject (Catcher.class) != null))
        {
            setLocation(800, 300);
        }
        else if((getOneIntersectingObject (Main.class) != null) || (getOneIntersectingObject (Team.class) != null))
        {
            setLocation(800, 300);
        }
        else if(getOneIntersectingObject (Animal.class) != null)
        {
            setLocation((int)(Math.random()*(1000))+50, (int)(Math.random() * 500)+50);
            animal.setLocation((int)(Math.random() * 1000)+50, (int)(Math.random() * 500)+50);
        }
        else if(getOneIntersectingObject (TeamArea.class) != null)
        {
            escore++;
            setLocation(800, 300);
            Enemy head = new Enemy(Team.class);
            addObject(head, 400, 300);
            Catcher catcher = new Catcher(head);
            addObject(catcher, 1150, 50);
        }
        getWorld().showText("Enemy Score: " + escore, 1090, 10);
        if (escore == 4)
        {
            GameOver end = new GameOver();
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
            move((int)(Math.random() * 10));
            if(isAtEdge()){
                turnTowards(300,200);
                turn((int)(Math.random() * 360));
            }
        } else if (Math.random() > 0.5) {
            turnTowards(target.getX(), target.getY());
            if(!intersects(target) && ((getX() > 50 && getX() < 1150) && ( getY() > 50 && getY() < 550 )))
            {
                move((int)(Math.random() * 10));
            }
        }
    }
}
