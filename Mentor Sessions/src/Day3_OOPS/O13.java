package Day3_OOPS;

public class O13 {
    public static void main(String[] args) {

    }
    public void printValues()
    {
        Util obj = new Util();
       // System.out.println(obj.pri +" "+obj.pub+" "+obj.pro +" "+obj.def);
        // private elements cant be accessed outside the class

    }
}
class Util
{
    private int pri;
    public int pub;
    protected int pro;
    int def;

}
