public class Name
{
    public static void main(String[] args)
    {
        Students student1 = new Students();
        System.out.println(student1.identity());

        Students student2 = new Students("Youngil", "Kim", 12, false);
        System.out.println(student2.identity());

        Students nainai = new Students();
        System.out.println(nainai.identity());
    }
}