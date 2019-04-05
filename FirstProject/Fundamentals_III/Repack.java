package Fundamentals_III;

public class Repack
{

    public static void main(String[] args){
        int[][] array = getArray(5, 5, true);
        print(array);
        print(repack(array, 3));
    }

    public static int[][] repack(int[][] array, int w){
        int arraylength = (array.length*array[0].length)/w;
        int z = 0;
        int h = 0;
        if((array.length*array[0].length) % w != 0)
        {
            arraylength++;
        }
        int[][] repacked = new int[arraylength][array[0].length];
        for(int x = 0; x<repacked.length; x++)
        {
            for(int y=0; y<array[0].length; y++)
            {
                if(y<w)
                {
                    if(h < array.length && z < array[h].length)
                    {
                        repacked[x][y] = array[h][z];
                        z++;
                        if(z == array[0].length)
                        {
                            z = 0;
                            h++;
                        }
                    }
                    else
                    {
                        repacked[x][y] = 0;
                    }
                }
                else
                {
                    repacked[x][y] = 0;
                }
            }
        }
        return repacked;
    }

    public static int[][] getArray(int h, int w, boolean random)
    {
        int[][] array = new int[h][w];
        int ct = 0;
        for(int y = 0; y < h; y++)
        {
            for(int x = 0; x < w; x++)
            {
                if(random)
                {
                    int v = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
                    array[y][x] = v == 0 ? 1 : v;
                }
                else
                {
                    array[y][x] = ct++;
                }
            }
        }
        return array;
    }

    public static void print(int[][] array)
    {
        String out = "{";
        for(int y = 0; y < array.length; y++)
        {
            out += "{";
            for(int x = 0; x < array[y].length; x++)
            {
                out += array[y][x];
                if(x != array[y].length -1)
                {
                    out += ", ";
                }
            }
            out += "}";
            if( y != array.length -1)
            {
                out+=",\n";
            }
        }
        out+= "}\n";
        System.out.println(out);
    }
}