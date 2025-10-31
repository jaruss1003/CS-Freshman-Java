/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 11

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 1, 2024

 * @Description: This program computes U.S customary units of liquid volume in terms of Gallons, Quarts, Pints, and Cups, given an initial number of Cups.

 * **************************************************************************/
 
import java.util.Scanner;

public class LiquidVolume {
public static void main(String args[]) {

int v, w, x, y,;

Scanner in = new Scanner(System.in);

System.out.print("Enter an integer between 1 and 99: ");
v = in.nextInt();

System.out.println( v + " cups is: ");

w = v/16; 

System.out.println( w + " gallons");
v = v%16;
x = v/4; 
System.out.println( x + " quarts");
v = v%4;
y = v/2;
System.out.println( y + " pints");
v = v%2;
System.out.println( v + " cups");
 } 
}
