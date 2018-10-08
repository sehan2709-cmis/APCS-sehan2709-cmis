package Fundamentals_II;

public class MakeGroups
{
    public static String[] makeGroups(String[] names, int groupSize)
    {
        int l = names.length/groupSize;
        if (names.length  % 2 == 1)
        {
            l++;
        }
        String[] array = new String[l];
        int x = 0;
        int y = 0;
        int z = 0;
        int n = 0;
        while (z < array.length)
        {
            x = 0;
            while (x < groupSize)
            {
                int ranom = (int)((Math.random() * (names.length - 1)));
                array[y] = names [ranom];
                while (n < groupSize-1)
                {
                    ranom = (int)((Math.random() * (names.length - 1)));
                    array[y] += names [ranom];
                    n+=1;
                }
                x = groupSize;
            }
            y++;
            z++;
        }
        return array;
    }

    public static String[] makeGroup(String[] names, int groupSize)
    {
        int l = names.length/groupSize;
        if (names.length  % 2 == 1)
        {
            l++;
        }
        String[] array = new String[l];
        int x =0;
        int y = 0;
        while (x<array.length)
        {
            y = 0;
            while( y<groupSize)
            {
                int ranom = (int)((Math.random() * (names.length - 1)));
                array[y] = names[ranom];
                y++;
            }
            x++;
        }
        return array;
    }

    public static String[] shuffle(String[] names)
    {
        String[] array = new String[names.length];
        int x = 0;
        int[] ram = new int[names.length];
        int z = 0;
        int n = 0; 
        while ( z < ram.length)
        {   
            n = 0;
            int ranom = (int)((Math.random() * (names.length - 1)));
            int ramon = (int)((Math.random() * (names.length - 1)));
            if ( ram[ranom] == null )
            ram[z] = ranom;
            z++;
        }
        while ( x < array.length)
        {
            array[x] = names[ram[x]];
            x++;
        }
        int y = 0;
        while ( y < array.length)
        {
            names[y] = array[y];
            y++;
        }
        return names;
    }
}