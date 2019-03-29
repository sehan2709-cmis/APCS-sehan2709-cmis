public class Thing extends Entity
{
    private int volume;
    
    Thing()
    {
        super("Default Thing");
    }

    Thing(String name)
    {
        super(name);
    }
    
    public int getVol()
    {
        return volume;
    }
    
    public void setVol(int vol)
    {
        this.volume = vol;
    }
}
