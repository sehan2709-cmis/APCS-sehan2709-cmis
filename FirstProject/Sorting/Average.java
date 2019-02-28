package Sorting;

public class Average
{
    public static void main(String[] args){
        long y = 10;
        long a = 0;
        long b = 0;
        long c = 0;
        long d = 0;
        for(int x =0; x < y; x++)
        {
            ArrayType at = ArrayType.SORTED; //SORTED, RANDOM, or REVERSED
            int n = 50000;
            int[] array = Util.getArray(n, at);
            int[] tmp = array;
            long start, stop, btime, itime, stime, mtime;

            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            array = tmp;

            start = System.nanoTime();
            SelectionSort.sort(array);
            stime = System.nanoTime() - start;
            array = tmp;

            start = System.nanoTime();
            InsertionSort.sort(array);
            itime = System.nanoTime() - start;
            array = tmp;

            start = System.nanoTime();
            MergeSort.sort(array);
            mtime = System.nanoTime() - start;

            a += btime;
            b += stime;
            c += itime;
            d += mtime;
            if(x == y-1)
            {
                btime = (a/y);
                stime = (b/y);
                itime = (c/y);
                mtime = (d/y);
                System.out.format(
                    "BubbleSort: %d %d\n"+
                    "SelectionSort: %d %d\n"+
                    "InsertionSort: %d %d\n"+
                    "MergeSort: %d %d\n", 
                    btime, BubbleSort.steps, stime, SelectionSort.steps,  itime, InsertionSort.steps, mtime, MergeSort.steps);
            }
        }
    }
}
