public abstract class CarAbstract {
    public abstract void honk(String tut);
    public abstract void light(String brightness);
    public static void brake(String safety) {
        System.out.println("A car needs to have working Brake: " + safety);
    }

}

class FordMotorAbstract extends CarAbstract{

    @Override
    public void honk(String tut) {
        System.out.println("Ford's honk sounds: "+tut);
    }

    @Override
    public void light(String brightness) {
        System.out.println("Ford's Light brightness: "+brightness);

    }
}
class ToyotaMotorAbstract extends CarAbstract{

    @Override
    public void honk(String tut) {
        System.out.println("Toyota's honk sounds: "+tut);
    }

    @Override
    public void light(String brightness) {
        System.out.println("Toyota's Light brightness: "+brightness);

    }


}
