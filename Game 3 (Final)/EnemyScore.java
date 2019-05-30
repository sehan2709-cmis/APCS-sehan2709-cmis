import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyScore extends Actor
{
    private int escore = 0;
    
    public void act() 
    {
        if(escore < 1)
        {
            escore = 0;
        }
    }
    
    public int getEscore()
    {
        return this.escore;
    }
    
    public void setEscore(int x)
    {
        escore = x;
    }
}
