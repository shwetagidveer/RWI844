import java.util.Scanner;

public class StringLenUpLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        
        // Get the length of the string
        int length = str.length();
        System.out.println("The Length of the String is: " + length);
        
        // Convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("UpperCase String: " + upperStr);
        
        // Convert the string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("LowerCase String: " + lowerStr);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

 // Output :- Enter a String: Shweta
 // The Length of the String is: 6
 // UpperCase String: SHWETA
 // LowerCase String: shweta
