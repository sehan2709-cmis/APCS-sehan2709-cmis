import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Television> TV = new ArrayList<Television>();
        
        Television hd = new HD("HD Bronze", 59.99);
        Television dlp = new DLP("DLP Silver", 99.99);
        Television lcd = new LCD("LCD Gold", 199.99);
        Television led = new LED("LED Platinum", 399.99);
        Television plasma = new Plasma("Plasma Sapphire", 499.99);
        
        TV.add(hd);
        TV.add(dlp);
        TV.add(lcd);
        TV.add(led);
        TV.add(plasma);
        
        for(int result = 0; result < TV.size(); result++)
        {
            if(result == 0)
            {
              System.out.println("TVs in the store...");  
            }
            System.out.println(TV.get(result));
        }
    }
}
