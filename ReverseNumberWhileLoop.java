import java.util.Scanner;

public class ReverseNumberWhileLoop {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Initialize the reversed number to 0
        int reversedNumber = 0;

        // Reverse the number using a while loop
        while (number != 0) {
            int digit = number % 10;     // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit;     // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }
}

  // Output :-  Enter a number: 789456
  //	     Reversed number: 654987
