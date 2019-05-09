public class Team implements Interface
{
    private int players = 14;
    private int money = 10000000;

    public int getMoney()
    {
        return this.money;
    }

    public void add(int add)
    {
         players += add;
    }
}
