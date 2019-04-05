public class RecursionSortingQuiz
{
    public static void main(String[] args){
        System.out.println("I'm ready to serve you!");
    }

    /**
     * @param n the value
     * @return n!
     * 
     * Factorials
     * n! => n * n-1 * n-2 * ... * n -(n-1)
     * 10! => 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 3628800
     * 5! => 5 * 4 * 3 * 2 * 1 => 120
     * 0! => 1
     */
    public static int factorial(int n){
        if(n <= 0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
  
    /**
     * @param array the array to be sorted
     * @return the array sorted
     */
    public static int[] kiefferSort(int[] array){
        int yes_or_no = 0;
        for(int x = 0; x < array. length-1; x++)
        {
            if(array[x] > array[x+1])
            {
                yes_or_no++;
            }
        }
        if(yes_or_no > 0)
        {
            int r = (int)(Math.random()*(array.length-1)+1);
            int what = array[r];
            array[r] = array[0];
            array[0] = what;
            kiefferSort(array);
            return array;
        }
        else
        {
            return array;
        }
    }
}