import java.util.*;

public class Application
{
    public static void main(String args[])
    {
        Thing t1 = new Thing("it");
        System.out.println(t1);

        Person p1 = new Person("Sehan",19,'M');
        System.out.println(p1);

        Place pl = new Place("New York");
        pl.setPopul(50000);
        System.out.println(pl);

        Idea i1 = new Idea();
        i1.setPop(300);
        System.out.println(i1);

        List<Entity> entities = new ArrayList<Entity>();

        Person person = new Person();
        Place place = new Place();
        Thing things = new Thing();
        Idea idea = new Idea();

        entities.add(person);
        entities.add(place);
        entities.add(things);
        entities.add(idea);

        for(Entity e: entities)
        {
            p(e.getName());
            p(e.getAge());
            if(e instanceof Idea)
            {
                Idea i = (Idea)e;
                p(i.getPop());
            }
        }
    }
    
    public static void p(Object string)
    {
        System.out.println(string);
    }
}

