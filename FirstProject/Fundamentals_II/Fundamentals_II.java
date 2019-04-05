package Fundamentals_II;

public class Fundamentals_II
{
    public static void main( String args[] )
    {
        int[] integers = { 5, 4, 3, 2 ,1 };
        double[] doubles = { 5.0, 4.0, 3.0, 2.0, 1.0 };
        String[] string = { "five", "four", "three", "two", "one" };
        System.out.format( "\n%d\n%s\n%s\n", integers[0], doubles[2], string[4] );
    }

    public static void printArray( int[] array, boolean skip )
    {
        int x = 0;
        int y = 0;
        if( skip == true )
        {
            while( x < array.length )
            {
                System.out.print( array[ x ] + " " );
                x += 2;
            }
        }
        else
        {
            while( y < array.length )
            {
                System.out.print( array[y] + " " );
                y += 1;
            }
        }
        System.out.print( "\n" );
    }

    public static void printArray( double[] array, boolean skip )
    {
        int x = 0;
        int y = 0;
        if( skip == true )
        {
            while( x < array.length )
            {
                System.out.print( array[ x ] + " " );
                x += 2;
            }
        }
        else
        {
            while( y < array.length )
            {
                System.out.print( array[y] + " " );
                y += 1;
            }
        }
        System.out.print( "\n" );
    }

    public static void printArray( String[] array, boolean skip )
    {
        int x = 0;
        int y = 0;
        if( skip == true )
        {
            while( x < array.length )
            {
                System.out.print( array[ x ] + " " );
                x += 2;
            }
        }
        else
        {
            while( y < array.length )
            {
                System.out.print( array[y] + " " );
                y += 1;
            }
        }
        System.out.print( "\n" );
    }

    public static void printArray( boolean[] array, boolean skip )
    {
        int x = 0;
        int y = 0;
        if( skip == true )
        {
            while( x < array.length )
            {
                System.out.print( array[ x ] + " " );
                x += 2;
            }
        }
        else
        {
            while( y < array.length )
            {
                System.out.print( array[y] + " " );
                y += 1;
            }
        }
        System.out.print( "\n" );
    }

    public static int lastItem( int[] array )
    {
        int x = ( array.length - 1 );
        return array[ x ];
    }

    public static double lastItem( double[] array )
    {
        int x = ( array.length - 1 );
        return array[ x ];
    }

    public static boolean lastItem( boolean[] array )
    {
        int x = ( array.length - 1 );
        return array[ x ];
    }

    public static String lastItem( String[] array )
    {
        int x = ( array.length - 1 );
        return array[ x ];
    }

    public static int middleItem( int[] array )
    {
        int x = ( ( array.length - 1 ) / 2 );
        return array[ x ];
    }

    public static double middleItem( double[] array )
    {
        int x = ( ( array.length - 1 ) / 2 );
        return array[ x ];
    }

    public static boolean middleItem( boolean[] array )
    {
        int x = ( ( array.length - 1 ) / 2 );
        return array[ x ];
    }

    public static String middleItem( String[] array )
    {
        int x = ( ( array.length - 1 ) / 2 );
        return array[ x ];
    }

    public static int[] randomInts(int n, int min, int max)
    {
        int [] array = new int[n];
        int x = 0;
        while ( x < array.length)
        {
            int result = (int)((Math.random() * (max - min + 1)) + min);
            array[x] += result;
            x += 1;
        }
        return array;
    }

    public static double[] randomDoubles(int n, double min, double max)
    {
        double [] array = new double[n];
        int x = 0;
        while ( x < array.length)
        {
            double result = (double)((Math.random() * (max - min + 1)) + min);
            array[x] += result;
            x += 1;
        }
        return array;
    }

    public static int[] copy( int[] array )
    {
        int[] errey = new int[array.length];
        int x = 0;
        while ( x < array.length )
        {
            errey[x] += array[x];
            x += 1;
        }
        return errey;
    }

    public static double[] copy( double[] array )
    {
        double[] errey = new double[array.length];
        int x = 0;
        while ( x < array.length )
        {
            errey[x] += array[x];
            x += 1;
        }
        return errey;
    }

    public static boolean[] copy( boolean[] array )
    {
        boolean[] errey = new boolean[array.length];
        int x = 0;
        while ( x < array.length )
        {
            errey[x] = array[x];
            x += 1;
        }
        return errey;
    }

    public static String[] copy( String[] array )
    {
        String[] errey = new String[array.length];
        int x = 0;
        while ( x < array.length )
        {
            errey[x] = array[x];
            x += 1;
        }
        return errey;
    }

    public static int[] pairs(int n)
    {
        int[] array = new int[n*2];
        int x = 1;
        int y = 0;
        while ( y < n*2 )
        {
            array[y] = 2 * x;
            array[y + 1] = 2 * x;
            x += 1;
            y += 2;
        }
        return array;
    }

    public static int[] concat(int[] a, int[] b)
    {
        int x = a.length + b.length;
        int[] array = new int[x];
        int y = 0;
        int z = 0;
        int n = 3;
        while ( y < a.length )
        {
            array[y] = a[y];
            y += 1;
        }
        while ( z < b.length )
        {
            array[n+z] = b[z];
            z += 1;
        }
        return array;
    }

    public static int[] merge(int[] a, int[] b)
    {
        int[] array = new int[a.length + b.length];
        int x = 0;
        int y = 0;
        int w = 0;
        while (y < array.length)
        {
            if( x < a.length)
            {
                array[y] = a[x];
                x += 1;
                y += 1;
            }
            if( w < b.length)
            {
                array[y] = b[w];
                y += 1;
                w += 1;
            }
        }
        return array;
    }

    public static void reverse(int[] array)
    {
        int[] reverse = new int[array.length];
        int x = 0;
        int y = array.length -1;
        while( x < array.length )
        {
            reverse[x] = array[y];
            x++;
            y--;
        }
        int z = 0;
        while( z< reverse.length)
        {
            System.out.print(reverse[z]);
            z++;
        }
    }

    public static int[] subArray(int[] array, int start, int stop)
    {
        int[] arry = new int[stop-start+1];
        int x = 0;
        while( start <= stop )
        {
            arry[x] = array[start];
            start++;
            x++;
        }
        return arry;
    }

    public static int[] compareArrays (int[] a, int[] b)
    {
        int scoreA = 0;
        int scoreB = 0;
        int compareLength = 0;
        int newA [];
        int newB [];
        if (a.length == b.length)
        {
            compareLength = a.length;
            newA = a;
            newB = b;
        }
        else if (a.length > b.length)
        {
            compareLength = a.length;
            newB = new int [compareLength];
            for (int length = 0; length < b.length; length ++)
            {
                newB [length] = b [length];
            }
            newA = a;
        }
        else
        {
            compareLength = b.length;
            newA = new int [compareLength];
            for (int length = 0; length < b.length; length ++)
            {
                newA [length] = a [length];
            }
            newB = b;
        }

        for (int posit = 0; posit < compareLength; posit ++)
        {
            if (newA [posit] > newB [posit])
            {
                scoreA ++;
            }   
            else
            {
                scoreB ++;
            }
        }

        if (scoreA > scoreB)
            return a;
        else if (scoreB > scoreA)
            return b;
        else
            return null;
    }
    //14
    public static int[] minimize (int[] array, int threshold)
    {
        int[] result = new int [array.length];
        for (int posit = 0; posit < array.length; posit ++)
        {
            if (array[posit] > threshold)
                result[posit] = threshold;
            else 
                result[posit] = array[posit];
        }
        return result;
    }
    //15
    public static void maximize(int[] array, int threshhold)
    {
        for (int posit = 0; posit < array.length; posit ++)
        {
            if (array[posit] < threshhold)
                array[posit] = threshhold;
            else 
                array[posit] = array[posit];
        }
    }
    //16
    public static double[] maxMerge(double[] a, double[] b)
    {
        int scoreA = 0;
        int scoreB = 0;
        int compareLength = 0;
        double [] newA;
        double [] newB;
        if (a.length == b.length)
        {
            compareLength = a.length;
            newA = a;
            newB = b;
        }
        else if (a.length > b.length)
        {
            compareLength = a.length;
            newB = new double [compareLength];
            for (int length = 0; length < b.length - 1; length ++)
            {
                newB [length] = b [length];
            }
            newA = a;
        }
        else
        {
            compareLength = b.length;
            newA = new double [compareLength];
            for (int length = 0; length < a.length - 1; length ++)
            {
                newA [length] = a [length];
            }
            newB = b;
        }
        double [] result = new double [compareLength];
        for (int resultP = 0; resultP < compareLength - 1; resultP ++)
            if (a [resultP] < b [resultP])
                result [resultP] = newB [resultP];
            else
                result [resultP] = newA [resultP];
        return result;
    }
}