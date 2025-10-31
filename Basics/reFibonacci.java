/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 26

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 26, 2024

 * @Description: Prints nth Fibonacci (method from slides) 

 * **************************************************************************/
import java.util.Scanner; 
class reFibonacci { 
 public static int fib (int n, int a, int b) { 
  if (n==1) 
   return a; 
  else 
   return fib(n-1, b, a+b);
 } 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in); 
  System.out.print("Enter n: "); 
  int n = in.nextInt();  
  int x; 
  x = fib(5,0,1);
  int result = fib(n,0,1); 
  System.out.println(result);  
 }
}
