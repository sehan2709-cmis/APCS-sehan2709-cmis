package BlackJack;
import java.util.*;

public class Game
{
    private Deck deck;
    private List<Owner> players;
    private Owner dealer;
    
    public Game ()
    {
        deck = new Deck(((int)(Math.random() * 5))+1);
        deck.shuffle();
        
        ArrayList<Hand> hold = new ArrayList<Hand>();

        int amount_players = ((int)(Math.random() * 3))+4;
        for(int player = 0; player < amount_players; player++)
        {
            Hand place = new Hand();
            for(int holding = 0; holding < 2; holding++)
            {
                place.addCard(deck.draw());
            }
            hold.add(place);
        }
        
        
        Hand dealer_hand = hold.get(0);
        int dealer_value = hold.get(0).getValue();

        for(int play = 0; play < amount_players; play++)
        {
            Hand player_hand = hold.get(play);
            int player_value = player_hand.getValue();
            if(21 - player_value < 21 - dealer_value)
            {
                System.out.format("Player %d have won! \n", play);
            }
        }
    }
}
