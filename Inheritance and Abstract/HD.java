public class HD extends Television
{
    public HD(){
        super("HD", 59.99);
    }
    
    public HD(String model, double price)
    {
        super.setModel(model);
        super.setPrice(price);
    }
}
