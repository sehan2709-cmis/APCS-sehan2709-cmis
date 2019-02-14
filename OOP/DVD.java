import javax.swing.JOptionPane;

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
        int users = Integer.parseInt(JOptionPane.showInputDialog("Type your Seoncds: "));
        Clock time2 = new Clock(userh, userm, users);
        System.out.println(time2.timeis());
    }

}
