public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock()
    {
        this.hours = 11;
        this.minutes = 55;
        this.seconds = 15;
    }
    
    public Clock(int hours, int minutes, int seconds)
    {
        this();
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public String timeis()
    {
        return String.format("The times is %d:%d:%d\n", hours, minutes, seconds);
    }
}
