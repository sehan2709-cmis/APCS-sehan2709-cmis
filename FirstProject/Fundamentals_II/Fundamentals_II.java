package Fundamentals_II;

public class Fundamentals_II
{
    public static void main(String args[])
    {
        int[] integers = {5, 4, 3, 2 ,1};
        double[] doubles = {5.0, 4.0, 3.0, 2.0, 1.0};
        String[] string = {"five", "four", "three", "two", "one"};
        System.out.format("\n%d\n%s\n%s\n", integers[0], doubles[2], string[4]);
    }

    public static void printArray(int[] array, boolean skip)
    {
        int x = 0;
        int y = 0;
        if( skip == true )
        {
            while( x < array.length )
            {
                System.out.print(array[x] + " ");
                x += 2;
            }
        }
        else
        {
            while( y < array.length )
            {
                System.out.print(array[y] + " ");
                y += 1;
            }
        }
        System.out.print("\n");
    }

    public static void printArray(double[] array, boolean skip)
    {

    }

    public static void printArray(String[] array, boolean skip)
    {

    }

    public static void printArray(boolean[] array, boolean skip)
    {

    }
}