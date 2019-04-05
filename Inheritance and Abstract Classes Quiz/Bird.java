import java.util.*;

public class Bird extends Animal
{
    private String color;

    public Bird(int x, int y, String color)
    {
        super(x,y);
        setGraphic("   \\" + "\n   (o>\n\\_//)\n _/_)\n  _|_ \n");
        this.color = color;
    }

    public boolean eat(String what)
    {
        if(what == "worms" || what == "seeds")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getColor()
    {
        return this.color;
    }

    public void fly(int dx, int dy){
        List<Integer> location = new ArrayList<>();
        location.addAll(super.getLocation());
        int xcalculate = dx - location.get(0);
        int ycalculate = dy - location.get(1);
        for(int flying = 0; flying < Math.abs(xcalculate); flying++)
        {
            if(dx < 0)
            {
                super.move(-1, 0);
            }
            else
            {
                super.move(1, 0);
            }
        }
        for(int flying = 0; flying < Math.abs(ycalculate); flying++)
        {
            if(dy < 0)
            {
                super.move(0, -1);
            }
            else
            {
                super.move(0, 1);
            }
        }
    }

    public String toString(){
        System.out.println("Bird");
        System.out.println(super.getGraphic());
        List<Integer> location = new ArrayList<>();
        location.addAll(super.getLocation());
        System.out.format("x: %d \ny: %d\n", location.get(0), location.get(1));
        String out = super.toString();
        return out;
    }
}
