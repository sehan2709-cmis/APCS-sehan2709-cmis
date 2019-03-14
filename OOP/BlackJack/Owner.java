package BlackJack;

public class Owner
{
    private String Name; 
    private int Chips; 
    private int Bet;
    private Hand hand;
    private int player_n;

    public Owner()
    {
        Name = "Mr. Delaer"; 
        Chips = 1000000; 
        Bet = 0;
        player_n = 0;
    }
    
    public Owner(String Name, int Chips, int Bet, Hand hand,int player_n)
    {
        this.Name = Name;
        this.Chips = Chips;
        this.Bet = Bet;
        this.hand = hand;
        this.player_n = player_n;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public int getChips()
    {
        return Chips;
    }
    
    public int getBet()
    {
        return Bet;
        /*
         * get a get_thing for hand by making a different return system.
         */
    }
}