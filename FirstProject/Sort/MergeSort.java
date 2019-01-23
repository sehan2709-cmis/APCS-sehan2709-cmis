package Sort;

public class MergeSort
{
    public static int[] MergeSort(int[] array)
    {
        if(array.length == 1)
        {
            return array;
        }
        else
        {
            int satta = array.length;
            int[] x = new int [array.length/2];
            int[] y = new int [array.length - x.length];
            int working = 0;
            for(working = 0; working < x.length; working++)
            {
                x[working] = array[working];
            }
            for(int mama = 0; mama < y.length; mama++)
            {
                y[mama] = array[working];
                working++;
            }
            x = MergeSort(x);
            y = MergeSort(y);
            int[] z = new int [array.length];
            int a = 0;
            int b = 0;
            for (int ang = 0; ang < array.length; ang++)
            {
                if(a == x.length)
                {
                    z[ang] = y[b];
                    b++;
                }
                else if (b == y.length)
                {
                    z[ang] = x[a];
                    a++;
                }
                else if(x[a] >= y[b])
                {
                    z[ang] = y[b];
                    b++;
                }
                else if(x[a] < y[b])
                {
                    z[ang] = x[a];
                    a++;
                }
            }
            return z;
        }
    }
}
