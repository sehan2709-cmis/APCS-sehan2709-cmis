public class Thing extends Entity
{

    public Thing(){
        super("default");
    }
    
    public Thing(String name, int age){
        super(name, age);
    }
    
    public String toString(){
        String out = super.toString();
        out += "->Thing";
        return out;
    }
}