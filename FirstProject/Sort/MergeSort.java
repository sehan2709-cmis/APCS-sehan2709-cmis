package Sort;

public class MergeSort
{
    public static int[] MergeSort(int[] array)
    {
        if( array.length != 1)
        {
            int satta = array.length;
            int[] x = new int [array.length/2];
            int[] y = new int [array.length - x.length];
            MergeSort(x);
            MergeSort(y);
            int[] z = new int [array.length];
            int a = 0;
            int b = 0;
            for (int ang = 0; ang < array.length; ang++)
            {
                if(x[a] > y[b])
                {
                    
                    a++;
                }
                else if(x[a] < y[b])
                {
                    b++;
                }
            }
        }
        else
        {
            return array;
        }
    }
}
