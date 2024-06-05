import java.util.Scanner;

public class PalindromeNoEx {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Enter a number to check if it is a palindrome: ");
        
        int n = in.nextInt();	 // Read the number from the user
        int temp = n; 		// Store the original number for comparison
        int r, sum = 0;
        
        while (n > 0) {
            r = n % 10;	 // Get the remainder (last digit)
            sum = (sum * 10) + r; // Build the reversed number
            n = n / 10; 	// Remove the last digit from the number
        }
        
        // Check if the original number is equal to the reversed number
        if (temp == sum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }      
        
    }
}
class PalindromeNoEx{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
