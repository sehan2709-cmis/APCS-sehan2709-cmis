import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class sperm extends Actor
{
    private int score = 0;
    private int life;
    private LifeBar lifebar;
    
    public sperm()
    {
        getImage().scale(50,15);
        life = 100;
        lifebar = new LifeBar(life);
    }
    
    public sperm(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(-10);
        }
        move(8);
        if(isTouching(WBCell.class)){
            life -= 25;
            if(life <=0){
                Greenfoot.stop();
                getWorld().showText("you lose", 300,200);
            } else {
                lifebar.setLife(life);
            }
        }
    }    
}
