
public class MainCar{
    public static void main(String[] args) {
        CarInterface fordMotor=new FordMotor();
        CarInterface toyotaMotor= new ToyotaMotor();

        fordMotor.honk("Beep! Beep!!");
        fordMotor.light("Bright!");
        fordMotor.brake("Safe!");

        toyotaMotor.honk("Beep! Beep!! Beep!!!");
        toyotaMotor.light("Super Bright");
        toyotaMotor.brake("Super Safe!");
    }
}
