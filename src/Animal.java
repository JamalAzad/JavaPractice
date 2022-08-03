class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Horse extends Animal {
    public void animalSound() {
        System.out.println("The horse says: neigh neigh");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class MainMethod {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myHorse = new Horse(); // Create a Horse object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myHorse.animalSound();
        myDog.animalSound();
    }
}


