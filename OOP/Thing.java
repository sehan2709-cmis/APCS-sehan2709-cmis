public class Thing
{
    private int x1 = 2020;
    private double x2 = 20.20;
    private boolean x3 = true;
    private String x4 = "2020 is my gradution da";

    public Thing()
    {
        this.x1 = 58774485;
        this.x2 = 587744.85;
        this.x3 = false;
        this.x4 = "58774485 is very YAHEA in Korean";
    }
    
    public Thing(int xx)
    {
        this();
        this.x1 = xx;
    }
    
    public void setx1(int a)
    {
        this.x1 = a;
    }
    
    public void setx2(double a)
    {
        this.x2 = a;
    }
    
    public void setx3(boolean a)
    {
        this.x3 = a;
    }
    
    public void setx4(String a)
    {
        this.x4 = a;
    }
    
    public int getx1()
    {
        return x1;
    }

    public double getx2()
    {
        return x2;
    }

    public boolean getx3()
    {
        return x3;
    }

    public String getx4()
    {
        return x4;
    }
}