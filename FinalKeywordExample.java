// File: FinalKeywordExample.java

// Demonstrating the final keyword

// Final class
final class FinalClass {
    void display() {
        System.out.println("This is a final class. It cannot be subclassed.");
    }
}

// Final method
class ParentClass {
    final void finalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }

    void normalMethod() {
        System.out.println("This is a normal method. It can be overridden.");
    }
}

// Child class attempting to override final method
class ChildClass extends ParentClass {
    // Uncommenting the below method will cause a compile-time error
    // void finalMethod() {
    //     System.out.println("Attempting to override final method.");
    // }

    @Override
    void normalMethod() {
        System.out.println("This normal method is overridden.");
    }
}

public class FinalKeywordExample {
    // Final variable
    final int finalVariable = 42;

    void demonstrateFinalVariable() {
        // Uncommenting the below line will cause a compile-time error
        // finalVariable = 50;
        System.out.println("The value of the final variable is: " + finalVariable);
    }

    public static void main(String[] args) {
        FinalKeywordExample example = new FinalKeywordExample();
        example.demonstrateFinalVariable();

        // Final class example
        FinalClass finalClass = new FinalClass();
        finalClass.display();

        // Final method example
        ParentClass parent = new ParentClass();
        parent.finalMethod();
        parent.normalMethod();

        ChildClass child = new ChildClass();
        child.finalMethod(); // Calls the inherited final method
        child.normalMethod(); // Calls the overridden method
    }
}

//O/p: The value of the final variable is: 42
//This is a final class. It cannot be subclassed.
//This is a final method. It cannot be overridden.
//This is a normal method. It can be overridden.
//This is a final method. It cannot be overridden.
//This normal method is overridden.