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
        super(1200, 600, 1, false);
        
        Main main = new Main();
        addObject(main, 400, 300);
        
        Rearea re = new Rearea();
        addObject(re, 800, 300);
        TeamRearea rea = new TeamRearea();
        addObject(rea, 400, 300);
        
        TeamArea teamarea = new TeamArea();
        addObject(teamarea, 50, 300);
        
        Area area = new Area();
        addObject(area, 1150, 300);
        
        head1 = new Enemy((Actor)teamarea);
        addObject(head1, 800, 300);
        head2 = new Enemy((Actor)teamarea);
        addObject(head2, 800, 300);
        head3 = new Enemy((Actor)teamarea);
        addObject(head3, 800, 300);
        
        Team team = new Team((Actor)area);
        addObject(team, 400, 300);
        Team teamI = new Team((Actor)area);
        addObject(teamI, 400, 300);
        
        Animal pig = new Animal(re);
        addObject(pig, 600, 300);
        Animal pig2 = new Animal(rea);
        addObject(pig2,600, 300);
        
        Catcher catcher1 = new Catcher(main);
        addObject(catcher1, 1150, 550);
        Catcher catcher2 = new Catcher(team);
        addObject(catcher2, 1150, 50);
        Catcher catcher3 = new Catcher(teamI);
        addObject(catcher3, 1150, 50);
        Catcher catcher4 = new Catcher(head1);
        addObject(catcher4, 50, 550);
        Catcher catcher5 = new Catcher(head2);
        addObject(catcher5, 50, 50);
        Catcher catcher6 = new Catcher(head3);
        addObject(catcher6, 50, 50);
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
                Wall2 car = new Wall2();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, 1200, (int)(tall));

                System.out.println(counter);
            }
        }
        if(counter == 300)
        {
            double out = (Math.random()*(1))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall3 car = new Wall3();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, (int)(tall), 0);

                System.out.println(counter);
            }
        }
        if(counter == 400)
        {
            double out = (Math.random()*(2))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall4 car = new Wall4();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, 0, (int)(tall));

                System.out.println(counter);
                
            }
        }
        if(counter == 600)
        {
            double out = (Math.random()*(3))+1;
            for(int cal = 0; cal < out; cal++)
            {
                Wall car = new Wall();

                GreenfootImage image = car.getImage();
                double tall = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car, (int)(tall), 600);
                
                Wall2 car2 = new Wall2();

                GreenfootImage image2 = car2.getImage();
                double tall2 = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car2, 1200, (int)(tall2));
                
                Wall3 car3 = new Wall3();

                GreenfootImage image3 = car3.getImage();
                double tall3 = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car3, (int)(tall3), 0);

                Wall4 car4 = new Wall4();

                GreenfootImage image4= car4.getImage();
                double tall4 = Math.random()*((getHeight()/5 * 3) + (getHeight()/2));
                addObject(car4, 0, (int)(tall4));
                
                System.out.println(counter);
                
                counter = 0;
            }
        }
    }
}
