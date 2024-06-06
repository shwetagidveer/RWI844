import java.util.Scanner;

public class LargeSmallNoForEach {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the Size of the Array:");
        int size = scanner.nextInt();

        // Create an array of the entered size
        int[] numbers = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize the largest and smallest variables
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Use a foreach loop to find the largest and smallest numbers
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        // Print the largest and smallest numbers
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

        // Close the scanner
        scanner.close();
    }
}

  // Output :- Enter the Size of the Array: 5
  //	   Enter 5 Numbers: 10 80 6 9 30
  //	   Largest Number: 80
  //	   Smallest Number: 6
