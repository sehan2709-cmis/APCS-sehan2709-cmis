public abstract class Student
{
    private String firstname;
    private String major;
    private int unit;

    public Student()
    {
        this.firstname = new String();
        this.major = new String();
        this.unit = 0;
    }

    public Student( String firstname, String major, int unit)
    {
        this.firstname = firstname;
        this.major = major;
        this.unit = unit;
    }

    public void setName( String name)
    {
        this.firstname = name;
    }

    public String getName()
    {
        return this.firstname;
    }

    public void setMajor( String major)
    {
        this.major = major;
    }
    
    public String getMajor()
    {
        return this.major;
    }
    
    public void setUnit(int unit)
    {
        this.unit = unit;
    }
    
    public int getUnit()
    {
        return this.unit;
    }

    public abstract int calculateTuition();
    
}
