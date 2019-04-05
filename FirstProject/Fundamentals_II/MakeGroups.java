package Fundamentals_II;

public class MakeGroups
{
    public static String[] shuffle(String[] names)
    {
        String[] array = new String[names.length];
        int r = (int)(Math.random() * names.length);
        int x = 0;
        int y = 1;
        while (x < names.length)
        {
            while(x == y)
            {    
                if(array[r] == null)
                {
                    array[r] = names[x];
                    x++;
                }
                else
                {
                    r = (int)(Math.random() * names.length);
                }
            }
            y++;
        }
        return array;
    }
    
    public static String[] makeGroup(String[] names, int groupSize)
    {
        int l = names.length/2;
        if (names.length % 2 == 1)
        {
            l++;
        }
        String[] array = new String[l];
        int r = (int)(Math.random() * array.length);
        int x = 0;
        int y = 0;
        while (x < l)
        {
            while(x == y)
            {    
                if(array[r] == null)
                {
                    array[r] = names[x];
                    x++;
                }
                else
                {
                    r = (int)(Math.random() * names.length);
                }
            }
            y++;
        }
        return array;
    }
}