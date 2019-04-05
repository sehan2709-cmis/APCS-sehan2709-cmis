import javax.swing.JOptionPane;
import java.util.Scanner;

public class Time
{
    public static void main(String[] args)
    {
        Clock time1 = new Clock();
        System.out.println(time1.timeis());
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
}