/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 10

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: September 26, 2024

 * @Description: Previously this program had a variety of syntax errors. I was tasked with finding the errors and removing them so that the program would compile. 

 * **************************************************************************/
import java.util.Scanner;

public class Syntax { 
   public static void main(String args[]) {
  Scanner keyboard = new Scanner(System.in); 
       int x, y, z, w, m, r, p;
       double d1, d2, d3;
       x = Integer.parseInt(args[0]);
       y = Integer.parseInt(args[1]);
       d1 = x * y; 
       d2 = x - y; 
       d3 = x + y;
       w = (x + y)/2; r = (x * y)/x;
       p = (x - y)/2;
       System.out.println("The Resulting Value Is:" + w);
       m = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
       System.out.println("The Product Is:" + m);
       System.out.print("Enter An Integer:");
       x = keyboard.nextInt();
       System.out.print("Enter Another Integer:");
       y = keyboard.nextInt();
       System.out.print("Enter Another Integer:");
       z = keyboard.nextInt();
       System.out.println("Result is:" + z * 10);
   }
}

