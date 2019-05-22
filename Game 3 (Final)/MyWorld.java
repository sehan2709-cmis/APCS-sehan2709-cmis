import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Enemy head1, head2, head3;
    
    public MyWorld()
    {    
        super(1000, 600, 1);
        TeamRearea teamRearea = new TeamRearea();
        
        Main main = new Main();
        addObject(main, 50, 300);
        Team team = new Team();
        addObject(team, 50, 300);
        Team teamI = new Team();
        addObject(teamI, 50, 300);
        
        head1 = new Enemy((Actor)main);
        addObject(head1, 950, 300);
        head2 = new Enemy((Actor)main);
        addObject(head2, 950, 300);
        head3 = new Enemy((Actor)main);
        addObject(head3, 950, 300);
        
        TeamArea teamarea = new TeamArea();
        addObject(teamarea, 50, 100);
        TeamArea teamarea2 = new TeamArea();
        addObject(teamarea2, 50, 500);
        TeamArea teamarea3 = new TeamArea();
        addObject(teamarea3, 200, 300);
        
    }
}
