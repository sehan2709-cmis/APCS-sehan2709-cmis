public class Music
{
    public static void main(String[] args)
    {
        Song list1 = new Song();
        System.out.println(list1.showing());
        Song list2 = new Song("Hosanna", "Hillsong Global Project", 374, true);
        System.out.println(list2.showing());
    }
}