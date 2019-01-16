package Sort;

public class RecursionEX
{
    public static void main(String[] args)
    {
        System.out.println(multiply(5, 5));
        System.out.println(division(66, 6));
        System.out.println(square(66, 6));
    }

    public static int multiply(int a , int b)
    {
        if(b == 1)
        {
            return a;
        }
        else if ( b == 0 || a == 0)
        {
            return 0;
        }
        else if ( b == 1)
        {
            return a;
        }
        else if (a == 1)
        {
            return b;
        }
        else
        {
            return a + multiply( a , b - 1);
        }
    }
    
    public static int division(int a, int b)
    {
        if(b == 1)
        {
            return a;
        }
        else if (a < b)
        {
            return 0;
        }
        else
        {
            return 1 + division( a - b , b);
        }
    }
    
    public static int square(int a, int b)
    {
        if(b == 0)
        {
            return 1;
        }
        else if (b == 1)
        {
            return a;
        }
        else
        {
            return (multiply(a, square(a, b - 1)));
        }
    }
}
