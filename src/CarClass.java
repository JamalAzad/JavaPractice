public class CarClass {

    public int speedLimit() {
        return 100;
    }

}
class Ford extends CarClass{

    public int speedLimit()
    {
        return 150;
    }

}

class Toyota extends CarClass {
    public int speedLimit() {
        return 150;
    }

}


class Mazda extends CarClass {

}

class Fighter {

    public int weight() {
        return 1500;
    }

}

class SpeedFinder {

    public static void main(String[] args) {
        CarClass obj0 = new CarClass();
        CarClass obj1 = new Ford();
        CarClass obj2 = new Toyota();
        String   obj3 = "this proves string is a class";
        System.out.println(obj3);
        //CarClass obj3 = new Honda();  // you can only create object of a class or their child class this will throw error
        //CarClass obj4 = new Fighter(); // you cannot create an object of a totally different class it will throw error
        CarClass obj5 = new Mazda();
        int num0= obj0.speedLimit();
        int num1= obj1.speedLimit();
        int num2= obj2.speedLimit();
        int num5= obj5.speedLimit();

        System.out.println("Speed Limit of car is: "+num0);
        System.out.println("Speed Limit of ford is: "+num1);
        System.out.println("Speed Limit of toyota is: "+num2);
        System.out.println("Speed Limit of mazda is: "+num5);

    }

}
