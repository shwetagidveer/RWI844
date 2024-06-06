import java.util.Arrays;

public class ArrayStringSortEx {
    public static void main(String[] args) {
        String[] names = {"Shweta", "Gidveer", "Pooja", "Sneha"};
        
        // Sorting the array
        Arrays.sort(names);
        
        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(names));
    }
}

 // Output :-  Sorted array: [Gidveer, Pooja, Shweta, Sneha]