/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 16

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 24, 2024

 * @Description: Outputs if a non-negative integer is even or odd and ends loop if the integer is negative

 * **************************************************************************/

import java.util.Scanner; 
public class Odd {
 public static void main(String [] args) {
  Scanner in = new Scanner(System.in); 
  System.out.print("Enter a number: ");
  int x = in.nextInt();
  while (x > -1) {
   if (x % 2 == 0) {    
    System.out.println("Number " + x + " is even");
   }  else {
    System.out.println("Number " + x + " is odd");
   } 
   System.out.print("Enter a number: ");
   x = in.nextInt(); 
  }
 //System.out.println("End loop");
 }
} 
