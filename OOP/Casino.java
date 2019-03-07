import javax.swing.JOptionPane;
import java.util.Scanner;

public class Casino
{
    public static void main(String [] args)
    {
        Card[] Deck = new Card[52];
        int place = 0;
        for(int x = 0; x < 4; x++)
        {
            for(int y = 0; y < 13; y++)
            {
                Card ang = new Card(x, y);
                Deck[place] = ang;
                place++;
            }
        }
        
        Hand hand = new Hand();
        for(int i = 0; i < 2; i++)
        {
            hand.addCard(Deck[(int)(Math.random()*52)]);
        }
        /*
        System.out.println(hand);
        
        */
        Hand hand2 = new Hand();
        while( hand2.getValue() < 21)
        {
            hand2.addCard(Deck[(int)(Math.random()*52)]);
            
            System.out.println(hand2);
            System.out.println(hand2.getValue());
        }
        
        
        /*
        System.out.println(hand.getValue());
        */
    }
}

