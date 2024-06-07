import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Creating a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Counting the frequency of each character
        for (char character : input.toCharArray()) {
            if (frequencyMap.containsKey(character)) {
                frequencyMap.put(character, frequencyMap.get(character) + 1);
            } else {
                frequencyMap.put(character, 1);
            }
        }

        // Printing the frequency of each character
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
