
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

    public int getValue(){
        int answer = 0;
        int a = 0;
        for(Card card : cards)
        {
            int num = card.getRank();
            if(1 <= num && num <= 9)
            {
                answer += num+1;
            }
            else if( 9 < num)
            {
                answer += 10;
            }
            else
            {
                if(a == 0)
                {
                    answer += 11;
                    a += 1;
                }
                else
                {
                    answer += 1;
                }
            }
        }
        return answer;
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