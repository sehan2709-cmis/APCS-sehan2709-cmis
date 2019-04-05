
import java.util.*;

public class Game
{
    private Deck deck;
    private List<Owner> players;
    private Owner player;

    public Game()
    {
        deck = new Deck(((int)(Math.random() * 5))+1);
        player = new Owner("dealer");
        players.add(player);
    }
    
    public void addPlayer(String name)
    {
        player = new Owner(name);
        players.add(player);
    }

    public void set()
    {
        deck.shuffle();
        for(int drawing = 0; drawing < players.size(); drawing++)
        {
            for(int holding = 0; holding < 2; holding++)
            {
                players tern = players.get(drawing);
                tern.addCard(deck.draw());
            }
            Owner owner = players.get(drawing);
            place.setHand(place);
        }
    }
}
