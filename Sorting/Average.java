public class Average
{
    public static void main(String[] args){
        long numberoftimes = 0;
        long aavr = 0;
        for(int x = 0; x < numberoftimes; x++)
        {
            ArrayType at = ArrayType.REVERSED; //SORTED, RANDOM, or REVERSED
            int n = 5;
            int[] array = Util.getArray(n, at);
            int[] tmp = array;
            long start, stop, btime, itime, stime, mtime;
            System.out.println("UNSORTED");
            Util.print(array);

            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            array = tmp;

            System.out.println("SORTED");
            Util.print(array);

            aavr += btime;

            if(x == numberoftimes-1)
            {
                btime = aavr/numberoftimes;
                System.out.format(
                    "BubbleSort: %d (nano second), %d\n", 
                    btime, BubbleSort.steps);
            }
        }

    }
}
