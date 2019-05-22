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
            if(!intersects(target)){
                move((int)(Math.random() * 5));
            }
        }
        //else{
        //    TeamArea teamarea = ((MyWorld)getWorld()).getTeamArea();
          //  turnTowards(teamarea.getX(), teamarea.getY());
            //move((int)(Math.random() * 5));
        }
        
       // TeamArea portal = (TeamArea) getOneIntersectingObject(TeamArea.class);
        //if(portal != null){
          //  MyWorld my = (MyWorld) getWorld();
            //Rearea rearea = my.getRearea();
          //  setLocation(rearea.getX(), rearea.getY());
        }
        // Add your action code here.
