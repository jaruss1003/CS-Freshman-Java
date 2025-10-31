/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 31, 2024

 * @Description: lists the factors of a given number. 

 * **************************************************************************/

import java.util.Scanner;
class Factors {
 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
  int number;
  System.out.print("Enter an integer: ");
  number = in.nextInt();
  System.out.println("Factors of " + number + " are:");
    //  cycle over all i from 1 to number
  for ( int i = 1; i <= number; i ++) {

   // if remainder of division of number by i is 0, print that i is a factor
    if ( number % i == 0)
     System.out.println( i );
  }
 }
}

