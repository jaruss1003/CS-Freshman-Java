/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 11

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 1, 2024

 * @Description: This program calculates the total price of an item after tax and how much each tax is. 

 * **************************************************************************/
import java.util.Scanner; 

public class SalesTax {
public static void main (String args[]) { 
int x, y, z;
double p;

Scanner in = new Scanner(System.in);

System.out.print("Enter Item Price: $");
p = in.nextDouble();
System.out.print("Enter Federal Tax Rate: ");
x = in.nextInt();
System.out.print("Enter State Tax Rate: ");
y = in.nextInt();
System.out.print("Enter County Tax Rate: ");
z = in.nextInt();


 System.out.println("Item Price: $" + p);
 System.out.println("Federal Tax: $" + (x * p)/100);
 System.out.println("State Tax: $" + (y * p)/100);
 System.out.println("County Tax: $" + (z * p)/100);

 System.out.println("Total Price: $" + (p + (x * p)/100 + (y * p)/100 + (z * p)/100));

 }
}
