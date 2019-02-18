import javax.swing.JOptionPane;
import java.util.Scanner;

public class DVD
{
    public static void main(String[] args)
    {
        Song list1 = new Song();
        System.out.println(list1.showing());
        Song list2 = new Song("Hosanna", "Hillsong Global Project", 374, true);
        System.out.println(list2.showing());
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
        
        Students student1 = new Students();
        System.out.println(list1.showing());
        Students student2 = new Students("Youngil", "Kim", 12, false);
        System.out.println(list2.showing());
        Students nainai = new Students();
        System.out.println(nainai.identity());
        
        String first = String.parseStr(JOptionPane.showInputDialog("Type your Hour: "));
        String last = String.parseStr(JOptionPane.showInputDialog("Type your Minutes: "));
        int gradee = Integer.parseInt(JOptionPane.showInputDialog("Type your Seconds: "));
        boolean sexx = Integer.parseInt(JOptionPane.showInputDialog("Type your Seconds: "));        Clock time2 = new Clock(userh, userm, users);
        System.out.println(time2.timeis());
        
        Students yeye = new Students(first, last, gradee, sexx);
        System.out.println(yeye.identity());
    }
}
