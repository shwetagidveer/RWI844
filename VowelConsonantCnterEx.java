import java.util.Scanner;

public class VowelConsonantCnterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        // Initialize counters for vowels and consonants
        int vowelCnt = 0;
        int consonantCnt = 0;

        // Convert input to lower case to handle both upper and lower case letters uniformly
        input = input.toLowerCase();

        // Iterate through each character in the input string
        for (char character : input.toCharArray()) {
            if (character >= 'a' && character <= 'z') {      // Check if the character is a letter
                if (isVowel(character)) {
                    vowelCnt++;
                } else {
                    consonantCnt++;
                }
            }
        }

        // Printing the results
        System.out.println("Number of Vowels: " + vowelCnt);
        System.out.println("Number of Consonants: " + consonantCnt);

        scanner.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}


  // Output :- Enter a String: SHWETA
  //	    Number of Vowels: 2
  //	    Number of Consonants: 4
