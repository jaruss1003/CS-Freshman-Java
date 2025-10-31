/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 16

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: Ocotber 24, 2024

 * @Description: This program determines whether a non-negative number is even or odd, and if the number is negative, then the program stops and lists the number of odd and even numbers given.


 * **************************************************************************/

import java.util.Scanner; 
public class EvenOddCounts {
 public static void main(String [] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int x = in.nextInt();
  int countOfEvens = 0;
  int countOfOdds = 0;
  while (x > -1) {
   if (x % 2 == 0) {
    System.out.println("Number " + x + " is even");
    countOfEvens++;
   }  else {
    System.out.println("Number " + x + " is odd");
    countOfOdds++;
   }
   System.out.print("Enter a number: ");
   x = in.nextInt();
  }
 //System.out.println("End loop");
   System.out.println("Total number of even numbers: " + countOfEvens);
   System.out.println("Total number of odd numbers: " + countOfOdds); 

 }
}


 
