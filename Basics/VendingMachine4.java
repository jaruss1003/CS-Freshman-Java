/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 12

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 3, 2024

 * @Description: Modified Version of VendingMachine in which original amount,quarters, nickels, dimes, and pennies are removed. 

 * **************************************************************************/


import java.util.Scanner;
public class VendingMachine4 {
 public static void main(String[] args) {
  int amount;
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter an integer: ");
  amount = kb.nextInt();
  System.out.println(amount + " cents in coins is: ");
  
  System.out.println("amount/25");
  amount = amount%25; // Extract the quarters
  System.out.println("amount/10");
  amount = amount%10; // Extract the dimes
  System.out.println("amount/5");
  System.out.println("amount%5");

 }
} 
