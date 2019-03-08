import javax.swing.JOptionPane;
import java.util.Scanner;

public class Casino
{
    public static void main(String [] args)
    {
        /*
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

        System.out.println(hand);

        Hand hand2 = new Hand();
        while( hand2.getValue() < 21)
        {
        hand2.addCard(Deck[(int)(Math.random()*52)]);

        System.out.println(hand2);
        System.out.println(hand2.getValue());
        }
        System.out.println(hand.getValue());
         */
        int rank = 0;
        int suit = 0;
        int steps = 2;
        Deck game = new Deck(2);
        System.out.print("Step 1" + "\n");
        while(game.nCards() > 0)
        {
            Card paper = game.draw();
            if(rank == 12)
            {
                System.out.print(paper + "\n");
                rank = 0;
                suit++;
                if(suit == 4)
                {
                    System.out.format("\n" + "Step %s",steps + "\n");
                    suit = 0;
                    steps++;
                }
            }
            else
            {
                System.out.print(paper + ", ");
                rank++;
            }
        }
    }
}

