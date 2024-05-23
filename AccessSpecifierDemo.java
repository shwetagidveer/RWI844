// File: AccessSpecifierDemo.java
package accessspecifierdemo;

class DefaultClass {
    void display() {
        System.out.println("This is the default access specifier.");
    }
}

public class PublicClass {
    public void display() {
        System.out.println("This is the public access specifier.");
    }
}

class AccessSpecifiersExample {
    public static void main(String[] args) {
        // Default access specifier
        DefaultClass defaultObj = new DefaultClass();
        defaultObj.display(); // Accessible within the same package
        
        // Public access specifier
        PublicClass publicObj = new PublicClass();
        publicObj.display(); // Accessible from anywhere
        
        // Private access specifier
        PrivateClass privateObj = new PrivateClass();
        privateObj.showPrivate(); // Private method within the same class
        
        // Protected access specifier
        ProtectedClass protectedObj = new ProtectedClass();
        protectedObj.display(); // Accessible within the same package or through inheritance
    }
}

class PrivateClass {
    private void display() {
        System.out.println("This is the private access specifier.");
    }

    void showPrivate() {
        display(); // Accessible within the same class
    }
}

class ProtectedClass {
    protected void display() {
        System.out.println("This is the protected access specifier.");
    }
}
