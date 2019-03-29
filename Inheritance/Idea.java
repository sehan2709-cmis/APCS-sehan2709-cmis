public class Idea extends Entity
{
    private int popularity;
    
    Idea()
    {
        super("Idea of Sehan");
    }
    
    Idea(String name)
    {
        super(name);
    }
    
    public int getPop()
    {
        return popularity;
    }
    
    public void setPop(int pop)
    {
        this.popularity = pop;
    }
}
