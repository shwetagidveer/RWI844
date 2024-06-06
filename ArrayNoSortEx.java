import java.util.Arrays;

public class ArrayNoSortEx {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 9};
        
        // Sorting the array
        Arrays.sort(numbers);
        
        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

  // Output :-  Sorted array: [1, 2, 3, 5, 8, 9]
