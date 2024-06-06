import java.util.Scanner;

public class ReverseStringDoWhile {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a String:");
        String input = scanner.nextLine();

        // Initialize the index to the last character of the string
        int index = input.length() - 1;

        // Print the string in reverse order using a do-while loop
        System.out.print("Reversed String is : ");
        do {
            System.out.print(input.charAt(index));
            index--;
        } while (index >= 0);

        // Close the scanner
        scanner.close();
    }
}

 // Output :- Enter a String:  Shweta
 //	   Reversed String is : atewhS