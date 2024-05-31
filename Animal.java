// Animal.java
public interface Animal {
    void makeSound(); // Abstract method

    default void sleep() { // Default method
        System.out.println("The animal is sleeping");
    }

    static void staticMethod() { // Static method
        System.out.println("This is a static method in the interface");
    }

    String TYPE = "ANIMAL"; // Constant
}

  // Output :- Bark
  //	   The animal is sleeping
  //	   This is a static method in the interface
  //	    ANIMAL
