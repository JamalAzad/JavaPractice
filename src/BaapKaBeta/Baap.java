package BaapKaBeta;

public class Baap {
    public String y;
    public int x;
    public static String land(String a)
    {
        System.out.println("Total Area: "+a);
        return a;
    }
    public static int money(int m){
        System.out.println("Money: "+m);
        return m;
    }


    public static void main(String[] args) {
        //BaapKaBeta.Baap baap = new BaapKaBeta.Baap();
        Baap.land("7");
       // System.out.println("Total Area : "+baap.land("7"));
    }
    public Baap(String area){
        y=area;
    }
    public Baap(int age){
        x=age;
    }

}


//class Beta extends Baap{
//    public static void main(String[] args) {
//        //BaapKaBeta.Baap beta= new BaapKaBeta.Baap();
//        Baap.land("5 Acre");
//    }
//}

