import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
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
        MyWorld scre = (MyWorld) getWorld();
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
            setLocation((int)(Math.random()*(350))+800, (int)(Math.random() * 500)+50);
            animal.setLocation((int)(Math.random() * 1000)+50, (int)(Math.random() * 500)+50);
            int escore = scre.getScore().getEscore();
            scre.getScore().setEscore(escore + 1);
            MyWorld w = (MyWorld) getWorld();
            Team team = new Team(w.getArea());
            getWorld().addObject(team, 400, 300);
        }
        else if(getOneIntersectingObject (TeamArea.class) != null)
        {
            int escore = scre.getScore().getEscore();
            scre.getScore().setEscore(escore + 2);

            setLocation(800, 300);
            MyWorld w = (MyWorld) getWorld();
            int y = (int)(Math.random() * 2)+1;
            for(int x = 0; x < y; x++)
            {
                Team team = new Team(w.getArea());
                getWorld().addObject(team, 400, 300);
            }
        }
        int escore = scre.getScore().getEscore();
        getWorld().showText("Enemy Score: " + escore, 1090, 10);

        if (scre.getScore().getEscore() == 4)
        {
            Greenfoot.setWorld(new BG());
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
            move((int)(Math.random() * 9));
            if(isAtEdge()){
                turnTowards(300,200);
                turn((int)(Math.random() * 360));
            }
        } else if (Math.random() > 0.5) {
            turnTowards(target.getX(), target.getY());
            if(!intersects(target) && ((getX() > 50 && getX() < 1150) && ( getY() > 50 && getY() < 550 )))
            {
                move((int)(Math.random() * 9));
            }
        }
    }
}
