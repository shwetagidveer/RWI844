import java.util.Scanner;

// Custom exception class
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

public class VoterThrowThrows {

    // Method to check voter eligibility
    public static void checkVoterAge(int age) throws InvalidVoterAgeException {
        if (age < 18) {
            // Throwing a custom exception if age is less than 18
            throw new InvalidVoterAgeException("Age must be 18 or older to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to take user input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reading the age from user input

        try {
            checkVoterAge(age); // Checking if the user is eligible to vote
        } catch (InvalidVoterAgeException e) {
            // Handling the custom exception
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thanks!!!...");
        }

        scanner.close(); // Closing the scanner
    }
}
