// File: PrivateClass.java
package accessspecifierdemo;

class PrivateClass {
    private void display() {
        System.out.println("This is the private access specifier.");
    }

    void showPrivate() {
        display(); // Accessible within the same class
    }
}
