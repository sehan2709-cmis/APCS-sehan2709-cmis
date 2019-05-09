public class Play implements MovieCharacteristic
{
    private String name = "SON";
    private int age = 26;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return 26;
    }

    public void after(int year)
    {
        if (year < (2019-26))
        {
            age = 0;
        }
        else if(year < 2019)
        {
            int last = 2019 - year;
            age = 26 - last;
        }
        else if (year > 2019)
        {
            int past = year - 2019;
            age += past;
        }
        else
        {
            age += 0;
        }
    }
}
