public class DLP extends Television
{
    public DLP(){
        super("DLP", 99.99);
    }
    
    public DLP(String model, double price)
    {
        super.setModel(model);
        super.setPrice(price);
    }
}
