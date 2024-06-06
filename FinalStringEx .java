
public class FinalStringEx {
    public static void main(String[] args) {
        final String str = "Hello, Shweta!";    
       
        // Concatenation creates a new string, but str reference cannot be changed
        String newStr = str + " Welcome to Java.";
        System.out.println("Original String: " + str);  // Output: Hello, World!
        System.out.println("New String: " + newStr); // Output: Hello, World! Welcome to Java.       
    }
}
