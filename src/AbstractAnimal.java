//Abstract class
abstract class AbstractAnimal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

//Subclass (inherit from Animal)
class Horse1 extends AbstractAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The horse says: neigh neigh");
    }
}

class Main {
    public static void main(String[] args) {
        Horse myHorse = new Horse(); // Create a Horse object
        myHorse.animalSound();
        myHorse.sleep();
    }
}
