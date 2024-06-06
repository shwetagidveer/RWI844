public class StringLenUpLowEx {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Get the length of the string
        int length = str.length();
        System.out.println("The Length of the String is: " + length);
        
        // Convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("UppercCase String: " + upperStr);
        
        // Convert the string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("LowerCase String: " + lowerStr);
    }
}
