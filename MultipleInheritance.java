// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// Class that implements both interfaces
class Dog implements Animal, Pet {
    // Implementing method from Animal interface
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    // Implementing method from Pet interface
    public void play() {
        System.out.println("Dog is playing");
    }
}

// Main class to test multiple inheritance
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling methods implemented from both interfaces
        dog.eat();
        dog.play();
    }
}

 //Output :- Dog is eating
 //                 Dog is playing