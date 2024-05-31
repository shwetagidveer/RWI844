// Define the Animal abstract class
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println("The animal is sleeping");
    }

    public String getName() {
        return name;
    }
}

// Define the Dog subclass
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Define the Main class with the main method
public class MainAbs {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.getName()); // Output: Buddy
        dog.makeSound(); // Output: Bark
        dog.sleep(); // Output: The animal is sleeping
    }
}

 // Output :- Buddy
 //	   Bark
 //	  The animal is sleeping