import java.util.Random;

public class Card
{
    private String type;
    private String number;
    private String[] types = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card()
    {
        type = types[(int)(Math.random() * types.length)];
        number = numbers[(int)(Math.random() * numbers.length)];
    }

    public Card(String type, String number)
    {
        this.type = type;
        this.number = number;
    }

    public String Getnumber()
    {
        return this.number;
    }

    public String toString()
    {
        return "The " + number + " of " + type;
    }
}