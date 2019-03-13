package BlackJack;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.*;

public class Casino
{
    public static void main(String [] args)
    {
        Deck deck = new Deck(((int)(Math.random() * 5))+1);
        deck.shuffle();
        
        ArrayList<Hand> hold = new ArrayList<Hand>();
        
        int amount_players = ((int)(Math.random() * 6))+1;
        for(int player = 0; player < amount_players; player++)
        {
            Hand place = new Hand();
            for(int holding = 0; holding < 2; holding++)
            {
                place.addCard(deck.draw());
            }
            hold.add(place);
        }
    }
}

