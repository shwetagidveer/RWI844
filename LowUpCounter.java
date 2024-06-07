import java.util.Scanner;

public class LowUpCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters for lowercase and uppercase letters
        int lowerCnt = 0;
        int upperCnt = 0;

        // Counting lowercase and uppercase letters
        for (char character : input.toCharArray()) {
            if (Character.isLowerCase(character)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(character)) {
                uppercaseCount++;
            }
        }

        // Printing the results
        System.out.println("Number of LowerCase Letters: " + lowerCnt);
        System.out.println("Number of UpperCase Letters: " + upperCnt);

        scanner.close();
    }
}
