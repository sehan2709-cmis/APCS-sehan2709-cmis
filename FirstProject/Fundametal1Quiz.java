import java.util.Scanner;

public class Fundametal1Quiz
{
    public static int method1(int a, int b, int c){
        int result = 0;
        if (a >= c && b >= c){
            result = a * b;
        }
        else if (a >= b && c >= b){
            result = a * c;
        }
        else if (b >= a && c >= a){
            result = b * c;
        }
        return result;
    }

    public static int method2(int a, int b){
        int result = 0;
        while (result < a + 1){
            for(int r = result; r < a + 1; r++){
                result += r * b;
            }
        }
        return result;
    }

    public static String method3(int h, int w){
        int horizontal = (w-1)/2;
        int vertical = (h-1)/2;
        String out = "";
        int y = 0;
        int x = 0;
        if (h%2==1 && w%2==1 && h>0 && w>0){
            for(y = 0; y < h; y++){
                for(y = 0; y < vertical; y++){
                    for(x = 0; x < horizontal; x++){
                        out += " ";
                    }
                    out += "|";
                    for(x = 0; x < horizontal; x++){
                        out += " ";
                    }
                    out += "\n";
                }
            }
            for(x = 0; x < horizontal; x++){
                out += "-";
            }
            out += "+";
            for(x = 0; x < horizontal; x++){
                out += "-";
            }
            out += "\n";
            for(y = 0; y < h; y++){
                for(y = 0; y < vertical; y++){
                    for(x = 0; x < horizontal; x++){
                        out += " ";
                    }
                    out += "|";
                    for(x = 0; x < horizontal; x++){
                        out += " ";
                    };
                }
            }
        }
        else{
            return ("+");
        }
        return out;
    }
}