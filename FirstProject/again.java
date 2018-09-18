public class again{
    public static int method1(int a, int b, int c){
        int AxB = a * b;
        int AxC = a * c;
        int BxC = b * c;
        int output = 0;
        if (AxB >= AxC && AxB >= BxC){
            output = (AxB);
        }
        else if (AxC >= AxB && AxC >= BxC){
            output = (AxC);
        }
        else if (BxC >= AxB && BxC >= BxC){
            output = (BxC);
        }
        return output;
    }

    public static int method2(int a, int b){
        int output = 0;
        for (int c = 0; c <= a; c++){
            output += b * c;
        }
        return output;
    }

    public static void method3(int h, int w){
        String output = "";
        if (h % 2 == 1 && w % 2 == 1 && h > 0 && w > 0){
            for (int y = 0; y < h; y++){
                if (y == h / 2){
                    for (int x = 0; x < w; x++){
                        if (x == w / 2){
                            output += "+";
                        }
                        else{
                            output += "-"; 
                        }
                    }
                    output += "\n";
                }
                else{
                    for (int x = 0; x < w / 2; x++){
                        output += " ";
                    }
                    output += "|\n";
                }
            }
        }
        else {
            output += "+";
        }
        System.out.print(output);
    }
}
