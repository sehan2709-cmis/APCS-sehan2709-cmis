package Sort;

public class InsertionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array)
    {
        for(int greater = 1; greater < array.length; greater++)
        {
            int subtract_greater = 0;
            while(array[greater-subtract_greater] < array[greater-subtract_greater-1])
            {
                int loading = array[greater-subtract_greater-1];
                array[greater-subtract_greater-1] = array[greater-subtract_greater];
                array[greater-subtract_greater] = loading;
                if(greater - subtract_greater != 1)
                {
                    subtract_greater++;
                }
            }
        }
    }

    public static void sortt(int[] array)
    {
        for(int x = 1; x < array.length; x++)
        {
            int y = 0;
            while(array[x-y] < array[x-y-1])
            {
                int a = array[x-y-1];
                array[x-y-1] = array[x-y];
                array[x-y] = a;
                if(x-y != 1)
                {
                    y++;
                }
            }
        }
    }
}