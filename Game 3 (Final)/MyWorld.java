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
    int counter = 0;
    
    public MyWorld()
    {    
        super(1000, 600, 1, false);
        
        Main main = new Main();
        addObject(main, 50, 300);
        Rearea re = new Rearea();
        addObject(re, 950, 300);
        TeamRearea rea = new TeamRearea();
        addObject(rea, 50, 300);
        
        TeamArea teamarea = new TeamArea();
        addObject(teamarea, 50, 100);
        TeamArea teamarea2 = new TeamArea();
        addObject(teamarea2, 50, 500);
        TeamArea teamarea3 = new TeamArea();
        addObject(teamarea3, 200, 300);
        
        Area area = new Area();
        addObject(area, 950, 100);
        Area areaI = new Area();
        addObject(areaI, 950, 500);
        Area areaII = new Area();
        addObject(areaII, 800, 300);
        
        head1 = new Enemy((Actor)teamarea);
        addObject(head1, 950, 300);
        head2 = new Enemy((Actor)teamarea2);
        addObject(head2, 950, 300);
        head3 = new Enemy((Actor)teamarea3);
        addObject(head3, 950, 300);
        
        Team team = new Team((Actor)areaI);
        addObject(team, 50, 300);
        Team teamI = new Team((Actor)areaII);
        addObject(teamI, 50, 300);
        
        Animal pig = new Animal(re);
        addObject(pig, 500, 300);
        Animal pig2 = new Animal(rea);
        addObject(pig2,500, 300);
    }
    
    public void act(){
        counter++;
        if(counter == 100)
        {
            double out = (Math.random()*(2))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall car = new Wall();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, (int)(tall), 600);

                System.out.println(counter);
                
            }
        }
        if(counter == 200)
        {
            double out = (Math.random()*(0))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall car = new Wall();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, (int)(tall), 600);

                System.out.println(counter);
                
            }
        }
        if(counter == 300)
        {
            double out = (Math.random()*(1))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall car = new Wall();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, (int)(tall), 600);

                System.out.println(counter);
                
            }
        }
        if(counter == 400)
        {
            double out = (Math.random()*(2))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall car = new Wall();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, (int)(tall), 600);

                System.out.println(counter);
                
            }
        }
        if(counter == 500)
        {
            double out = (Math.random()*(3))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall car = new Wall();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, (int)(tall), 600);

                System.out.println(counter);
                
            }
        }
        counter = 0;
    }
}
