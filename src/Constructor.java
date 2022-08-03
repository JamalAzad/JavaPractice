public class Constructor {

    int x;
    String y;

    Constructor(int i) {
        x = i;
    }


    Constructor(String j) {
        y = j;
    }

}

class TryConstructor {

//    TryConstructor(int i) {
//        super(i);
//    }
//    TryConstructor(String j) {
//    super(j);
//    }

    public static void main(String[] args) {

        Constructor first = new Constructor(1);
        Constructor second = new Constructor("a");

        System.out.println(first.x);
        System.out.println(second.y);

    }

}
