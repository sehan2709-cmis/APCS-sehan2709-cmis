public class OST
{
    private String instru;
    private String instr;
    private int amount;
    
    public OST()
    {
        instru = "flute";
        instr = "piccolo";
        amount = 2;
    }
    
    public OST(String instru, String instr, int amount)
    {
        this.instru = instru;
        this.instr = instr;
        this.amount = amount;
    }
    
    public String play()
    {
        return String.format("In this band, there is %s and %s. There is %d player in the band.\n", instru, instr, amount);
    }
}
