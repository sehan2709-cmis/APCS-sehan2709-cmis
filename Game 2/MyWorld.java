import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int counter = 0;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 725, 1, false);

        Bird bird = new Bird();
        addObject(bird, 100, getHeight()/2);
        prepare();
    }

    public void act(){
        counter++;
        if(counter == 100)
        {
            double out = (Math.random()*((2)+1))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Tree tree = new Tree();

                GreenfootImage image = tree.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(tree, getWidth(), (int)(tall));

                System.out.println(counter);
                counter = 0;
            }
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
