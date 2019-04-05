package Sort;

public class SelectionSort
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

    public static void sort(int[] array){
        for(int x = 0; x <array.length; x++)
        {
            int z = x;
            for(int y =x; y < array.length; y++)
            {
                if(array[y] < array[z])
                {
                    z = y;
                }
            }
            int a = array[x];
            array[x] = array[z];
            array[z] = a;
        }
    }
}