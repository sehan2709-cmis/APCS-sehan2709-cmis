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
        int[] result = new int [ array.length ];
        if(skip == true)
        {
            for( int index = 0; index < array.length; index++ )
            {
                if( index % 2 == 1 )
                {
                    result[ index ] = index;
                }
            }
        }
        else
        {
            for( int index = 0; index < array.length; index++ )
            {
                result[ index ] = index;
            }
        }
        System.out.println(result);
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