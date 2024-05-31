// InterfaceDog.java
public class InterfaceDog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        InterfaceDog dog = new InterfaceDog();
        dog.makeSound(); // Output: Bark
        dog.sleep(); // Output: The animal is sleeping

        // Calling the static method from the interface
        Animal.staticMethod(); // Output: This is a static method in the interface

        // Accessing the constant from the interface
        System.out.println(Animal.TYPE); // Output: ANIMAL
    }
}
