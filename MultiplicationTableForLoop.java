import java.util.Scanner;

public class MultiplicationTableForLoop {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Print the multiplication table for the entered number
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}

  // Output :- Enter a number: 9
 //Multiplication Table of 9:
 // 9 x 1 = 9
 // 9 x 2 = 18
 // 9 x 3 = 27
 // 9 x 4 = 36
 // 9 x 5 = 45
 // 9 x 6 = 54
 // 9 x 7 = 63
 // 9 x 8 = 72
 // 9 x 9 = 81
 // 9 x 10 = 90