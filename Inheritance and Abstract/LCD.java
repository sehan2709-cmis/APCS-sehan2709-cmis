public class LCD extends Television
{
    public LCD(){
        super("LCD", 199.99);
    }
    
    public LCD(String model, double price)
    {
        super.setModel(model);
        super.setPrice(price);
    }
}
