package Fundamentals_III;

public class FundamentalsThree
{
    public static void main(String[] args)
    {
        int [][] defaultIntArray = new int [5][5];
        int [][] literalIntArray = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        double [][] defaultDoubleArray = new double [5][5];
        double [][] literalDoubleArray = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
    }

    public static int returnValue (int [][] intArray, int y, int x)
    {
        return intArray [y][x];
    }

    public static double returnValue (double [][] doubleArray, int y, int x)
    {
        return doubleArray [y][x];
    }

    public static String returnValue (String [][] StringArray, int y, int x)
    {
        return StringArray [y][x];
    }

    public static void setValue (int[][] arr, int y, int x, int v)
    {
        arr [y][x] = v;
    }

    public static void setValue (double[][] arr, int y, int x, double v)
    {
        arr [y][x] = v;
    }

    public static void setValue (String[][] arr, int y, int x, String v)
    {
        arr [y][x] = v;
    }

    public static void print2DArray(int[][] array, boolean rowMajor)
    {
        int x = 0;
        int y = 0;
        if (rowMajor == true)
        {
            while( x < array.length)
            {
                y = 0;
                while( y < array[0].length)
                {
                    int z = array[x][y];
                    System.out.print(z+" ");
                    y++;
                }
                x++;
                System.out.println();
            }
        }
        else
        {
            while( x < array.length)
            {
                y = 0;
                while( y < array[0].length)
                {
                    int z = array[y][x];
                    System.out.print(z+" ");
                    y++;
                }
                x++;
                System.out.println();
            }
        }
    }

    public static void snakePrint(int[][] arr)
    {
        for(int y = 0; y < arr.length; y++)
        {
            if (y % 2 == 0)
            {
                for(int x = 0; x < arr[y].length; x++)
                {
                    System.out.print(arr[y][x]+" ");
                }
            }
            else
            {
                for(int x = arr[y].length-1; x >= 0; x--)
                {   
                    {
                        System.out.print(arr[y][x]+" ");
                    }
                }
            }
        }
    }

    /*
    public static String[][] locate(String[][] arr)
    {
    int r = (int)(Math.random()*(10));
    for(int x = 0; x < arr.length; x++)
    {
    for(int y = 0; y < arr[1].length; y++)
    {
    if(arr[x][y] == "#")
    {
    arr[x][y] = String.format("%d",r);
    }
    } 
    }
    return arr;
    }
     */
    // #7

    public static int[][] replace(int[][] array, int threshold, int newValue)
    {
        for(int x = 0; x < array.length; x++)
        {
            for(int y = 0; y < array[x].length; y++)
            {
                if(array[x][y] > threshold)
                {
                    array[x][y] = newValue;
                }
            }
        }
        return array;
    }
}