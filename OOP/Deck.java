import java.util.*;

public class Deck
{
    private List<Card> cards;

    public Deck(int nDecks)
    {
        cards = new ArrayList<Card>();

        for(int ndecks = 0; ndecks < nDecks; ndecks++)
        {
            for(int x = 0; x < 4; x++)
            {
                for(int y = 0; y < 13; y++)
                {
                    Card ang = new Card(x, y);
                    cards.add(ang);
                }
            }
        }
    }

    public int nCards()
    {
        return cards.size();
    }

    public Card draw()
    {
        int last = cards.size() -1;
        return cards.remove(last);
    }

    public void shuffle()
    {
    }
}