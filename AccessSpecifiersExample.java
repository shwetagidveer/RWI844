// File: AccessSpecifiersExample.java
package accessspecifierdemo;

public class AccessSpecifiersExample {
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
// javac accessspecifierdemo/DefaultClass.java accessspecifierdemo/PublicClass.java //accessspecifierdemo/PrivateClass.java accessspecifierdemo/ProtectedClass.java //accessspecifierdemo/AccessSpecifiersExample.java

//@echo off
// javac accessspecifierdemo/DefaultClass.java
// javac accessspecifierdemo/PublicClass.java
// javac accessspecifierdemo/PrivateClass.java
// javac accessspecifierdemo/ProtectedClass.java
// javac accessspecifierdemo/AccessSpecifiersExample.java


// javac accessspecifierdemo/*.java
// java accessspecifierdemo.AccessSpecifiersExample
