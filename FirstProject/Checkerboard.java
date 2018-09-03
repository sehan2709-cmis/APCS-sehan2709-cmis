import java.util.Scanner;
import java.util.Random;

public class Checkerboard
{
    public static void cherckerboard(int hight, int width){
        String sharp = "";
        String border = "+";
        String work = "|";
        for (int w = width; w > 0; w--){
            border += "-";
        }
        border += "+";
        System.out.println(border);
        for (int h = hight; h > 0; h--){
            for (int w = width; w > 0; w--){
                System.out.print(".");
                if (w == 0){
                    System.out.print("|\n");
                }
            }
        }
    }
}