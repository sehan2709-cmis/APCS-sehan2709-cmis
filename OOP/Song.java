public class Song
{
    private String title;
    private String singer;
    private int length;
    private boolean isitup;
    
    public Song()
    {
        this.title = "This is my Father's world";
        this.singer = "Tommy Walker's CD";
        this.length = 186;
        this.isitup = true;
    }

    public Song(String title, String singer, int length, boolean isitup)
    {
        this();
        this.title = title;
        this.singer = singer;
        this.length = length;
        this.isitup = isitup;
    }
    
    public String showing()
    {
        return String.format("   Song Title: %s\n   Song Length: %d seconds \n   Song Relase: %b\n", title, length, isitup);
    }
}
