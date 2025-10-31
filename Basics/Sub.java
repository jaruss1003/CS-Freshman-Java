/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 10

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: September 26, 2024

 * @Description: This program takes the diffeerence of 3 numbers 

 * **************************************************************************/


import java.util.Scanner; 

public class Sub {

  public static void main(String[] args) { 
     int s;

     Scanner in = new Scanner(System.in); // Setting up scanner variable

     System.out.println("Enter the 1st number: "); // To print a message

     int x = in.nextInt(); // To store value entered by user at command-line into a variable.

     System.out.println("Enter the 2nd number: ");

     int y = in.nextInt();

     System.out.println("Enter the 3rd number: ");

     int z = in.nextInt();

     s = x - y - z ;
     
     System.out.println("The difference is: " + s);

  }

}
