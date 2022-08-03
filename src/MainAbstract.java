
public class MainAbstract{
    public static void main(String[] args) {
        CarAbstract fordMotor=new FordMotorAbstract();
        CarAbstract toyotaMotor= new ToyotaMotorAbstract();

        fordMotor.honk("Beep! Beep!!");
        fordMotor.light("Bright!");
        CarAbstract.brake("Safe!");

        toyotaMotor.honk("Beep! Beep!! Beep!!!");
        toyotaMotor.light("Super Bright");
        CarAbstract.brake("Super Safe!");
    }
}
