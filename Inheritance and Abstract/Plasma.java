public class Plasma extends Television
{
    public Plasma(){
        super("Plasma", 499.99);
    }
    
    public Plasma(String model, double price)
    {
        super.setModel(model);
        super.setPrice(price);
    }
}
