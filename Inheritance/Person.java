public class Person extends Entity
{
    private char sex;

    Person()
    {
        super("Default Person");
        this.sex = 'X';
    }

    Person(String name, int age, char sex)
    {
        super(name);
        this.sex = sex;
    }

    public String toString()
    {
        String out = "";
        out += super.toString();
        out += "sex: " + sex + "\n";
        return out;
    }
    
    public char getSex()
    {
        return sex;
    }
    
    public void setSex(char morf)
    {
        this.sex = morf;
    }
    
    public void setAge(int newAge)
    {
        if(newAge <= 150)
        {
            super.setAge(newAge);
        }
    }
}
