public interface CarInterface {
    public abstract void honk(String tut);
    public abstract void light(String brightness);
    public abstract void brake(String safety);
}

class FordMotor implements CarInterface{
    @Override
    public void honk(String tut) {
        System.out.println("Ford's honk sounds"+tut);
    }

    @Override
    public void light(String brightness) {
        System.out.println("Ford's Light brightness"+brightness);
    }

    @Override
    public void brake(String safety) {
        System.out.println("Ford's Brake is"+safety);

    }
}
class ToyotaMotor implements CarInterface{

    @Override
    public void honk(String tut) {
        System.out.println("Toyota's honk sounds"+tut);
    }

    @Override
    public void light(String brightness) {
        System.out.println("Toyota's Light brightness"+brightness);

    }

    @Override
    public void brake(String safety) {
        System.out.println("Toyota's Brake is"+safety);

    }
}
