
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
        int time_shuf = (int)(Math.random() * 100);
        for(int shufing = 0; shufing < time_shuf ; shufing++)
        {
            int pick_card = (int)(Math.random() * cards.size());
            cards.add(cards.get(pick_card));
            cards.remove(pick_card);
        }
    }

    public String toString()
    {
        String out = "";
        for(Card card : cards)
        {
            out += card.toString() + " ";
        }
        return out;
    }
}
