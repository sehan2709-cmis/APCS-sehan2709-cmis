import java.util.Scanner;
import java.util.Random;

public class Checkerboard
{
    public static void cherckerboard(int height, int width){
        String sharp = "";
        String border = "+";
        String work = "|";
        int r = (int)(Math.random()*(height));
        int rr = (int)(Math.random()*(width));
        int rrr = (int)(Math.random()*(10));
        for (int w = width; w > 0; w--){
            border += "-";
        }
        border += "+";
        System.out.println(border);
        for (int h = 0; h < height; h++){
            System.out.print("|");
            for (int w = 0; w < width; w++){
                if (w % 2 == 0){
                    if (w == rr){
                        if (h % 2 == 0){
                            System.out.print("#");
                        }
                        else if (h % 2 ==1){
                            if (h != r){
                                System.out.print(" ");
                            }
                            else if (h == r){
                                System.out.print(rrr);
                            }
                        }
                    }
                    else if(w != rr){
                        if (h % 2 == 0){
                            System.out.print("#");
                        }
                        else if (h % 2 ==1){
                            System.out.print(" ");
                        }
                    }
                }
                else if (w % 2 == 1){
                    if (w == rr){
                        if (h % 2 == 1){
                            if (h == r){
                                System.out.print(rrr);
                            }
                            else if (h != r){
                                System.out.print("#");
                            }
                        }
                        else if (h % 2 == 0){
                            System.out.print(" ");
                        }
                    }
                    else if(w != rr){
                        if (h % 2 ==0){
                            System.out.print(" ");
                        }
                        else if (h % 2 == 1){
                            System.out.print("#");
                        }
                    }
                }
                if (w == width-1){
                    String right = "|\n";
                    System.out.print(right.trim());
                    System.out.print("\n");
                }
            }
        }
        System.out.println(border);
        System.out.println(" ");
    }
}