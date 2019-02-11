public class ThingApplication
{
    public static void main(String[] args)
    {
        Thing x = new Thing();
        Thing y = new Thing();
        x.setx1(33);
        y.setx1(44);
        System.out.println(x.getx1());
        System.out.println(x.getx2());
        System.out.println(y.getx1());
        System.out.println(y.getx2());
    }
}
