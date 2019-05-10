import greenfoot.*;

public class Jumper extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;

    public Jumper()
    {
        velocity = 0;
    }

    public void act() 
    {
        fall();
        if(Greenfoot.isKeyDown("space") && isGround())
        {
            jump();
        }
        move();
    }    

    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (isGround()){
            velocity = 0;
        }
        else
        {
            velocity += GRAVITY;
        }
    }

    public void jump()
    {
        velocity = -20;
    }

    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("left"))
        {
            x -= 6;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            x += 6;
        }
        setLocation(x,y);
    }

    public boolean isGround()
    {
        boolean isGround = false;
        if(getY() > getWorld().getHeight() - 50)
        {
            isGround = true;
        }
        return isGround;
    }
}
