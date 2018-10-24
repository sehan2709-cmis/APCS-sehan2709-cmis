package Fundamentals_III;

public class THREE_X_FIVE
{
    public static void main( String args[] )
    {
        System.out.println("20 arrays");
        int[][] array = defaultArray(3,5);
        for(int y=0; y<array.length; y++)
        {
            for(int x=0; x<array[0].length; x++)
            {
                int z = array[y][x];
                System.out.print(z+" ");
            }
            System.out.println();
        }
    }
    
    public static int[][] defaultArray(int h, int w)
    {
        int[][] result = new int [h][w];
        int x = 0;
        int hi = 0;
        int wi = 0;
        while( hi < h)
        {
            wi = 0;
            while (wi < w)
            {
                result[hi][wi] = x;
                x++;
                wi++;
            }
            hi++;
        }
        return result;
    }
}
