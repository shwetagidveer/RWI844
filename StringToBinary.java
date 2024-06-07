import java.util.Scanner;

public class StringToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a Character or a String: ");
        String input = scanner.nextLine();

        // Convert each character of the string to binary and print it
        for (char character : input.toCharArray()) {
            String binaryString = Integer.toBinaryString(character);
            System.out.println(character + " in binary: " + String.format("%8s", binaryString).replace(' ', '0'));
        }

        scanner.close();
    }
}

  // Output :- Enter a Character or a String: Shweta
  //	     S in binary: 01010011
  //	     h in binary: 01101000
  //	     w in binary: 01110111
  // 	      e in binary: 01100101
  //	      t in binary: 01110100
  //	      a in binary: 01100001