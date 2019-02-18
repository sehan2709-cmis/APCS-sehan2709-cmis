public class Students
{
    private String first_name;
    private String last_name;
    private int grade;
    private boolean sex;
    
    public Students()
    {
        first_name = "";
        last_name = "";
        grade = 11;
        sex = false;
    }
    
    public Students(String first_name, String last_name, int grade, boolean sex)
    {
        this();
        this.first_name = first_name;
        this.last_name = last_name;
        this.grade = grade;
        this.sex = sex;
    }
    
    public String identity()
    {
        return String.format("  For the sex: (false = male), (true = female)\n  The Student names is %d %d. His/Her grade is %d. His/Her sex is %d", first_name, last_name, grade, sex);
    }
}
