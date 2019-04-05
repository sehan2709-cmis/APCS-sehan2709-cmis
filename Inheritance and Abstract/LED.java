public class LED extends Television
{
    public LED(){
        super("LED", 399.99);
    }
    
    public LED(String model, double price)
    {
        super.setModel(model);
        super.setPrice(price);
    }
    
    
}
