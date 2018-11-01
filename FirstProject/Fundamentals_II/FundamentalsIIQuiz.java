package Fundamentals_II;

public class FundamentalsIIQuiz
{
    public static int[] minmax(int[] array)
    {
        int [] minmax = new int[2];
        minmax[1] = array[1];
        minmax[0] = array[0];
        for(int x =0; x < array.length; x++)
        {
            if(array[x] > minmax[1])
            {
                minmax[1] = array[x];
            }
            if(array[x] < minmax[0])
            {
                minmax[0] = array[x];
            }
        }
        return minmax;
    }

    public static int[] filter(int[] array, int min, int max, boolean positive)
    {
        int y = 0;
        if(positive == false)
        {
            for(int x = 0; x < array.length; x++)
            {
                if (array[x] < min)
                {
                    y++;
                }
                if (array[x] > max)
                {
                    y++;
                }
            }
        }
        if(positive == true)
        {
            for(int x = 0; x < array.length; x++)
            {
                if (array[x] >= min)
                {
                    if (array[x] <= max)
                    {
                        y++;
                    }
                }
            }
        }
        int [] result = new int[y];
        if(positive == false)
        {
            int z = 0;
            for(int x = 0; x < array.length; x++)
            {
                if (array[x] < min)
                {
                    result[z] = array[x];
                    z++;
                }
                if (array[x] > max)
                {
                    result[z] = array[x];
                    z++;
                }
            }
        }
        if(positive == true)
        {
            int z = 0;
            for(int x = 0; x < array.length; x++)
            {
                if (min <= array[x])
                {
                    if(array[x] <= max)
                    {
                        result[z] = array[x];
                        z++;
                    }
                }
            }
        }
        return result;
    }
}