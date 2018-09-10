public class cb
{
    public static void main(String args[])
    {
        System.out.println(cb(8, 6));
    }
    
    public static String Checkerboard(int h, int w){
        String out = "";
        String top = "+";
        for(int x = 0; x < w; x++){
            top += "-";  
        }
        top += "+\n";
        int nHashes = (h * w) / 2;
        int rLocation = (int)(Math.random() * nHashes);
        int hashCount = 0;
        System.out.println(nHashes);
        for(int y = 0; y < h; y++){
            out += "|";
            for(int x = 0; x < w; x++){
                boolean isHash = ((x + y) % 2) == 0;
                if(isHash){
                    if(rLocation == hashCount){
                        out += (int)(Math.random() * 10);
                    }else{
                        out += "#";
                    }
                    hashCount++;
                } else {
                    out += " ";
                }
            }
            out += "|\n";
        }
        out = top + out + top;
        return out;
    }
}