import java.util.Arrays;

public class SecondLargestUsingSort {
    public static void main(String[] args) {
        // Sample array
        int[] array = {3, 5, 1, 4, 2, 7, 6};

        // Ensure the array has at least two elements
        if (array.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        // Sort the array
        Arrays.sort(array);

        // Find the second largest element
        int largest = array[array.length - 1];
        Integer secondLargest = null;

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] != largest) {
                secondLargest = array[i];
                break;
            }
        }

        // Print the second largest element
        if (secondLargest != null) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("The array doesn't have a second largest element.");
        }
    }
}
