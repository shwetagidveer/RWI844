import java.util.Scanner;

public class NonRepeatedCharEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        // Assuming ASCII characters (128 characters)
        int[] charCount = new int[128];
        int[] charIndex = new int[128];

        // Initialize charIndex with a large value
        for (int i = 0; i < charIndex.length; i++) {
            charIndex[i] = Integer.MAX_VALUE;
        }

        // Counting the frequency and storing the first occurrence index
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            charCount[character]++;
            if (charIndex[character] == Integer.MAX_VALUE) {
                charIndex[character] = i;
            }
        }

        // Finding the first non-repeated character
        int firstNonRepeatedIndex = Integer.MAX_VALUE;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] == 1 && charIndex[i] < firstNonRepeatedIndex) {
                firstNonRepeatedIndex = charIndex[i];
            }
        }

        // Printing the result
        if (firstNonRepeatedIndex != Integer.MAX_VALUE) {
            System.out.println("The First Non-Repeated Character is: " + input.charAt(firstNonRepeatedIndex));
        } else {
            System.out.println("No Non-Repeated Character Found.");
        }

        scanner.close();
    }
}
