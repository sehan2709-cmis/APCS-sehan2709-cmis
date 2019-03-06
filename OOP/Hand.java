import java.util.*;
public class Hand
{
    private List<Card> cards;

    public Hand()
    {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card)
    {
        cards.add(card);
    }
    
    public int getValue()
    {
        for(Card card : cards){
            if(Rankcard = 0 || Rankcard = 13 || Rankcard = )
            {
            }
        }
    }

    public String toString()
    {
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }
}