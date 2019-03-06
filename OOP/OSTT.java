public class OSTT
{
    public static void main(String[] args)
    {
        OST waw = new OST();
        System.out.println(waw.play());
        OST wow = new OST("Clarients", "Oboe", 7);
        System.out.println(wow.play());
        OST halk = new OST();
        System.out.println(halk.play());
    }
}