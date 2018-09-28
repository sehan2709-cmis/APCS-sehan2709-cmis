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
        int z = 0;
        int n = 0;
        while ( z <= array.length+2  )
        {
            if ( x < a.length)
            {
                array[z] = a[x];
            }
            if ( y < b.length)
            {
                array[z+1] = b[y];
            }
            x += 1;
            y += 1;
            z += 2;
        }
        return array;
    }
}