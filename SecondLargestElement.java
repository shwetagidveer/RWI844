public class SecondLargestElement {
    public static void main(String[] args) {
        // Sample array
        int[] array = {3, 5, 1, 4, 2, 7, 6};

        // Ensure the array has at least two elements
        if (array.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        // First pass: Find the largest element
        int largest = array[0];
        for (int element : array) {
            if (element > largest) {
                largest = element;
            }
        }

        // Second pass: Find the second largest element
        Integer secondLargest = null;
        for (int element : array) {
            if (element != largest) {
                if (secondLargest == null || element > secondLargest) {
                    secondLargest = element;
                }
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
