public class BubbleSort
{
    public static void main(String[] args){
        int[] array = getArray(20, true);
        print(array);
        sort(array);
        print(array);
        sortt(array);
    }

    public static int[] sort(int[] array){
        boolean x = true;
        int yeah = 0;
        while( x = true)
        {
            x = false;
            for(int y = 0; y < array.length-1; y++)
            {
                if(array[y] > array[y+1])
                {
                    
                }
            }
        }
        return array;
    }
    
    public static int[] sortt(int[] array){
        int turn = 0;
        for(int x =0; x < array.length; x++)
        {
            for(int y = 0; y < array.length-1; y++)
            {
                if(array[y]>= array[y+1])
                {
                    turn = array[y+1];
                    array[y+1] = array[y];
                    array[y] = turn;
                }
            }
        }
        return array; 
    }

    public static int[] getArray(int w, boolean random){
        int[] array = new int[w];
        int ct = 0;
        for(int i = 0; i < w; i++){
            if(random)
                array[i] = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
            else
                array[i] = ct++;
        }
        return array;
    }

    public static void print(int[] array){
        String out = "{";
        for(int i = 0; i < array.length; i++){
            out += array[i];
            if( i != array.length -1)
                out+=", ";
        }
        out+= "}\n";
        System.out.println(out);
    }
}