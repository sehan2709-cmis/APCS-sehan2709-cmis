import java.util.*;

public class Person extends Entity
{
    private Place location;
    private List<Thing> possessions;
    public Person(){
        super("default");
    }
    
    public Person(String name, int age){
        super(name, age);
    }
   
    public void setAge(int newAge){
        if (newAge <= 150){
            super.setAge(newAge);
        }
    }
    
    public void setLocation(Place newLocation){
        location = newLocation;
    }
    
    public String toString(){
        String out = super.toString();
        out += "->Person";
        return out;
    }
}
