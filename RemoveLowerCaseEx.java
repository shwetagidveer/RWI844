import java.util.Scanner;

public class RemoveLowerCaseEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        // StringBuilder to store characters after converting lowercase to uppercase
        StringBuilder newString = new StringBuilder();

        // Iterate through each character in the input string
        for (char character : input.toCharArray()) {

            // If the character is a lowercase letter, convert it to uppercase
            if (Character.isLowerCase(character)) {
                newString .append(Character.toUpperCase(character));
            } else {

                // If the character is not a lowercase letter, keep it as is
                newString .append(character);
            }
        }

        // Convert modified string to a new string
        String upperCaseString = newString .toString();

        // Initialize counter for uppercase letters
        int upperCaseCnt = 0;

        // Iterate through each character in the upper case string
        for (char character : upperCaseString.toCharArray()) {

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(character)) {
                upperCaseCnt++;
            }
        }

        // Printing the results
        System.out.println(" New Modified String is :  " + upperCaseString);
        System.out.println("Number of UpperCase Letters :  " + upperCaseCnt);

        scanner.close();
    }
}

  // Output :-  Enter a String: shweta
  //	     Modified string: SHWETA
  //	     Number of uppercase letters: 6