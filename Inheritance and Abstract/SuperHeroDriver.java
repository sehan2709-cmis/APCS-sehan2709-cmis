import java.util.*;

public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        List<SuperHero> heroes = new ArrayList<SuperHero>();

        AsteroidMan astero = new AsteroidMan("White", false);
        astero.setName("AsteroidMan");
        FriedEggMan fried = new FriedEggMan("Yellow", true);
        fried.setName("FriedEggMan");
        AirpollutionMan airpol = new AirpollutionMan("Gray", true);
        airpol.setName("AirpollutionMan");

        heroes.add(astero);
        heroes.add(fried);
        heroes.add(airpol);

        for(int result = 0; result < heroes.size(); result++)
        {
            if(result == 0)
            {
                System.out.println("Original set of ArrayList heroes...");
            }
            System.out.print(heroes.get(result));
            System.out.println(heroes.get(result).motto());
        }
        System.out.print("\n");
        String[][] capedHeroes = new String[3][3];
        int ODinput = 0;
        int TDinput = 0;

        for(int result = 0; result < heroes.size(); result++)
        {
            if(heroes.get(result).isCaped() == true)
            {
                capedHeroes[ODinput][TDinput] = heroes.get(result).getName();
                if(TDinput < 3)
                {
                    TDinput++;
                }
                else
                {
                    ODinput++;
                    TDinput = 0;
                }
            }
        }
        
        System.out.println("\nPrinting 2D Array capedHeroes...");
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 3; y++)
            {
                System.out.print(capedHeroes[x][y] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("\nPrinting contents of capedHeroes...");
        for(int result = 0; result < heroes.size(); result++)
        {
            if(heroes.get(result).isCaped() == true)
            {
                System.out.print(heroes.get(result));
                System.out.println(heroes.get(result).motto());
            }
        }
        
        System.out.println("\nRemaining set of ArrayList heroes...");
        for(int result = 0; result < heroes.size(); result++)
        {
            if(heroes.get(result).isCaped() == false)
            {
                System.out.print(heroes.get(result));
                System.out.println(heroes.get(result).motto());
            }
        }
    }
}
