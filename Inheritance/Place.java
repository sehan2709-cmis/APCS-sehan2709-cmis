public class Place extends Entity
{
    private int population;
    private String name;

    Place()
    {
        super("Default Place");
    }

    Place(String name)
    {
        super(name);
    }
    
    public int getPopul()
    {
        return population;
    }
    
    public void setPopul(int Popul)
    {
        this.population = Popul;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String nae)
    {
        this.name = nae;
    }
}
