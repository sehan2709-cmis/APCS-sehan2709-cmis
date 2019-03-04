import javax.swing.JOptionPane;
import java.util.Scanner;

public class DVD
{
    public static void Music(String[] args)
    {
        Song list1 = new Song();
        System.out.println(list1.showing());
        Song list2 = new Song("Hosanna", "Hillsong Global Project", 374, true);
        System.out.println(list2.showing());
        Clock time1 = new Clock();
        System.out.println(time1.timeis());
    }

    public static void Time(String[] args)
    {
        int userh = Integer.parseInt(JOptionPane.showInputDialog("Type your Hour: "));
        int userm = Integer.parseInt(JOptionPane.showInputDialog("Type your Minutes: "));
        int users = Integer.parseInt(JOptionPane.showInputDialog("Type your Seconds: "));
        Clock time2 = new Clock(userh, userm, users);
        System.out.println(time2.timeis());

        Scanner input = new Scanner(System.in);
        System.out.print("Type your Hour: ");
        int userhh = input.nextInt();
        System.out.print("Type your Minutes: ");
        int usermm = input.nextInt();
        System.out.print("Type your Seconds: ");
        int userss = input.nextInt();
        Clock time3 = new Clock(userhh, usermm, userss);
        System.out.println(time3.timeis());
    }

    public static void Name(String[] args)
    {
        Students student1 = new Students();
        System.out.println(student1.identity());

        Students student2 = new Students("Youngil", "Kim", 12, false);
        System.out.println(student2.identity());

        Students nainai = new Students();
        System.out.println(nainai.identity());
    }

    public static void OSTT(String[] args)
    {
        OST waw = new OST();
        System.out.println(waw.play());
        OST wow = new OST("Clarients", "Oboe", 7);
        System.out.println(wow.play());
        OST halk = new OST();
        System.out.println(halk.play());
    }

    public static void Cardshow(String [] args)
    {
        Card[] Deck = new Card[52];
        int place = 0;
        for(int x = 0; x < 4; x++)
        {
            for(int y = 0; y < 13; y++)
            {
                Card ang = new Card(x, y);
                deck[place] = place;
                place++;
            }
        }
    }
}

