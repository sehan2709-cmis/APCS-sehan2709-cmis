public class Asian extends Person
{
    private String skin;
    private double hight;

    public Asian()
    {
        skin = "Yellow";
        hight = 172.69;
    }
    
    public String getSkin()
    {
        return skin;
    }
    
    public void setSkin(String skin)
    {
        this.skin = skin;
    }
    
    public double gethight()
    {
        return hight;
    }
    
    public void setHight(double hight)
    {
        this.hight = hight;
    }
    
    public String toString()
    {
        String out = "";
        out += super.toString() + "\n";
        out += "skin color: " + skin + "\n";
        out += "hight (cm): " + hight + "\n";
        return out;
    }
}
