public class Card
{
    private int suit; 
    private int rank; 
    private boolean faceUp;
    
    public Card(){
        suit = (int)(Math.random() * 4);
        rank = (int)(Math.random() * 13);
    }
    
    public String toString(){
        String[] suits = {"H","D","S","C"};
        String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String out = String.format("%s%s", ranks[rank], suits[suit]);
        return out;
    }
    
    public String Deck()
    {
        String[] suits = {"H","D","S","C"};
        String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] Deck = new String[52];
        int a = 0;
        for(int x = 0; x < 4; x++)
        {
            for(int y = 0; y < 13; y++)
            {
                Deck[a] = (suits[x] + ranks[y]);
                a++;
            }
        }
        System.out.print(Deck);
        return "gimoojii";
    }
}