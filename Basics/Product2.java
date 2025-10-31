/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 31, 2024

 * @Description: Computes the product of 2 integers

 * **************************************************************************/
import java.util.Scanner;
class Product2 {
 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  int a, b, result = 0;
  System.out.print("Would you like to multiply? ");
  String answer = in.next();
  while (answer.equals("yes")) {
  // Prompt user for two integers a and b
   System.out.print("Enter an integer: ");
   a = in.nextInt();
   System.out.print("Enter an integer: ");
   b = in.nextInt();  
// In a cycle with i from  1 to a, add b to variable "result"
   for ( int i = 1; i <= a; i ++ ) { 
     result += b; 
   }
   // Print result 
   System.out.println( a + " x " + b + " = " + result);
   System.out.print("Would you like to multiply? ");  
   answer = in.next();
  }
 }
}
