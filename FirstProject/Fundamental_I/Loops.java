package Fundamental_I;

import java.util.Scanner;
import java.util.Random;

public class Loops
{
    public static void suqareTible(){
        int i = 1;
        int in = i*i;
        for (i = 1; i <= 10; i++){
            in = i * i;
            int r = (int)(Math.random()*((in - i)+1)+i);
            System.out.format("%d\t%d\t%d\n", i, in, r);
        }
    }

    public static void triangle(int num)
    {
        int result = 0;
        for (int n = num; n > 0; n--)
        {
            result += n ;
        }
        System.out.format("%d Triangled is " + result, num);
    }
    
    public static void pyramid(int num)
    {
        int result = 0;
        for (int n = num; n>0; n--)
        {
            result += n*n;
        }
        System.out.format("%d Pyramided is " + result, num);
    }
}

