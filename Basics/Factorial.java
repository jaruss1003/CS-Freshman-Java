/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 18

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 29, 2024

 * @Description: Compute and output the factorial of a number and if it's even or odd

 * **************************************************************************/
import java.util.Scanner; 
public class Factorial {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int product = 1, number;
  int n;
  System.out.print("Enter n: ");
  n = in.nextInt();
  for (number = 1; number <= n; number++) {
   product = product * number; 
  }
   if (product % 2 == 0) {
    System.out.println(n + "!" + " is " + product + ", which is even");
   } else 
       System.out.println(n + "!" + " is " + product + ", which is odd");
 
 }
}
