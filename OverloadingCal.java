public class OverloadingCal{
    // Overloaded method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        OverloadingCal cal = new OverloadingCal();

        // Using the add method with two int parameters
        int sum1 = cal.add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum1);

        // Using the add method with three int parameters
        int sum2 = cal.add(1, 2, 3);
        System.out.println("Sum of 1, 2, and 3 is: " + sum2);

        // Using the add method with two double parameters
        double sum3 = cal.add(2.5, 3.5);
        System.out.println("Sum of 2.5 and 3.5 is: " + sum3);
    }
}

 // Output :- Sum of 5 and 10 is: 15
 //	   Sum of 1, 2, and 3 is: 6
 //	   Sum of 2.5 and 3.5 is: 6.0
