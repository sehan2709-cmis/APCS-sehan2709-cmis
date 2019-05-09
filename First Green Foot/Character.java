import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character extends Actor
{
    public void ack()
    {
        move();
    }
    
    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("S"))
        {
            y--;
        }
        if(Greenfoot.isKeyDown("A"))
        {
            x--;
        }
        if(Greenfoot.isKeyDown("W"))
        {
            y++;
        }
        if(Greenfoot.isKeyDown("D"))
        {
            x++;
        }
        setLocation(x,y);
    }
}
