/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 26

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 26, 2024

 * @Description: Computes and returns the nth Fibonnaci number (nonRecursive)

 * **************************************************************************/
import java.util.Scanner; 
class nrFibonacci {
 public static void main(String[] args) { 
  Scanner in = new Scanner(System.in); 
  System.out.print("Enter n: ");
  int n = in.nextInt();
  int result = nonRecursiveFib(n);
  System.out.println(result);
 }
 public static int nonRecursiveFib(int n) {
  if (n == 1)
   return 0;
  else if (n == 2)
   return 1;
  else {
   int a, b, c = 0;
   a = 0;
   b = 1;
   for (int i=3; i<=n; i++) {
    c = a+b;
    a = b;
    b = c;
   }
   return c;
  }
 }
}
