/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 14 

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 20, 2024

 * @Description: Program will determine if any two added together equals the third

 * **************************************************************************/
import java.util.Scanner;
class SumsUp {
  public static void main (String [] args) {
  Scanner in = new Scanner(System.in);
   System.out.println("Enter three integers:");
   int x = in.nextInt();
   int y = in.nextInt();
   int z = in.nextInt();
   if (x+y == z) {
     System.out.println("yes");
   } else if (x+z==y) {
     System.out.println("yes");
   } else if (y+z == x) {
     System.out.println("yes");
   } else { 
     System.out.println("no"); 
}
  }
}
