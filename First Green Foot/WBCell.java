import greenfoot.*;

public class WBCell extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;

    public WBCell()
    {
        this(50,100);
        velocity = 0;
    }
    
    public WBCell(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }

    public void act() 
    {
        fall();
        if((Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("w"))&& isGround())
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
        velocity = -35;
    }

    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("a"))
        {
            x -= 5;
        }
        if(Greenfoot.isKeyDown("d"))
        {
            x += 5;
        }
        setLocation(x,y);
    }

    public boolean isGround()
    {
        boolean isGround = false;
        if(getY() > getWorld().getHeight() - 45)
        {
            isGround = true;
        }
        return isGround;
    }
}
