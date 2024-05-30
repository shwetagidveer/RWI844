class OverridingPet {
    // Method to be overridden
    public void sound() {
        System.out.println("Pet makes a sound");
    }
}
class Dog extends OverridingPet {
    // Overriding the sound() method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        OverridingPet d = new Dog();
        d.sound();  // Output: Dog barks
    }
}
