public class Player implements Changeable
{
    private int length;
    private int width;

    public void change(int value)
    {
        length += value;
    }

    public int getPosition()
    {
        return width;
    }
}
