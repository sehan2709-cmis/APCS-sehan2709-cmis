public class Entity
{
    private String name;
    private int age;
    private int value;
    
    public Entity(String name)
    {
        this.name = name;
    }
    
    public Entity(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Entity(int value, int age)
    {
        this.value = value;
        this.age = age;
    }
    
    public String toString()
    {
        String out = "";
        out += super.toString() + "\n";
        out += "name: " + name + "\n";
        return out;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int ag)
    {
        this.age = ag;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int cost)
    {
        this.value = cost;
    }
}
