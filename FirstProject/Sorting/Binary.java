package Sorting;

public class Binary
{
    public static void main(String[] args){
        int n = 10;
        int[] array = new int[n];
        int v = (int)(Math.random() * n) - (n/2) ;
        for(int i = 0; i < n; i++){
            System.out.println(v);
            array[i] = v;
            if(Math.random() <= 0.5)
                v+= (int)(Math.random() * n);

        }
        int key = Math.random() > 0.5 ? (int)(Math.random() * (array[n-1] - array[0])) + array[0] : array[(int)(Math.random() * array.length)];
        System.out.println("Key: "+key);
        System.out.println("Index: "+search(array, key));
    }

    public static int search(int[] array, int value){
        int step = 8;
        int front = 0;
        int back = array.length - 1 ;
        int matchIdx = -1;
        while(front <= back){
            int mid = (front + back) / 2;
            int middleValue = array[mid];
            if(middleValue == value){
                step += 2;
                matchIdx = mid;
                break;
            }else if(value > middleValue){
                step += 2;
                front = mid + 1;
            }else if(value < middleValue){
                step += 3;
                back = mid - 1;
            }
        }
        step++;
        System.out.format(
            "Binary Search Steps: %d\n",
            step);
        return matchIdx;
    }

    public static int searchthefirst(int[] array, int value){
        int front = 0;
        int back = array.length - 1 ;
        int matchIdx = -1;
        while(front <= back)
        {
            int mid = (front + back) / 2;
            int middleValue = array[mid];
            if(middleValue == value)
            {
                matchIdx = mid;
                while(middleValue == value)
                {
                    if(mid == 0)
                    {
                        break;
                    }
                    mid--;
                    middleValue = array[mid];
                }
                mid++;
                if(middleValue != value)
                {
                    middleValue = array[mid];
                }
                break;
            }
            else if(value > middleValue)
            {
                front = mid + 1;
            }
            else if(value < middleValue)
            {
                back = mid - 1;
            }
        }
        return matchIdx;
    }
}