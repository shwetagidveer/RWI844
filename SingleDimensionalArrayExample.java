public class SingleDimensionalArrayExample {
    public static void main(String[] args) {
        // Declaration and creation
        int[] array = new int[5];

        // Initialization
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // Accessing elements
        System.out.println("First element : " + array[0]);
        System.out.println("Second element : " + array[1]);

        // Looping through the array
        System.out.println("All elements : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        // Using foreach loop
        System.out.println("All elements using foreach:");
        for (int element : array) {
            System.out.println(element);
        }
    }
}


 // Output :- First element : 10
 //Second element : 20
 //All elements :
 //Element at index 0: 10
 //Element at index 1: 20
 //Element at index 2: 30
 //Element at index 3: 40
 //Element at index 4: 50
 //All elements using foreach:
 //10
 //20
 //30
 //40
 //50