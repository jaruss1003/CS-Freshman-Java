/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 12

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 4, 2024

 * @Description: Modified Version of VendingMachine in which "original amount" variable was removed

 * **************************************************************************/

import java.util.Scanner;
public class VendingMachine2 {
 public static void main(String[] args) {
  int amount, quarters, dimes, nickels, pennies;
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter an integer: ");
  amount = kb.nextInt();
  System.out.println(amount + " cents in coins is: ");
  
  quarters = amount/25; // Determine the number of quarters
  amount = amount%25; // Extract the quarters
  dimes = amount/10; // Determine the number of dimes
  amount = amount%10; // Extract the dimes
  nickels = amount/5; // Determine the number of nickles
  pennies = amount%5; // Extract the nickles; leftover is pennies

  
  System.out.println(quarters + " quarters ");
  System.out.println(dimes + " dimes ");
  System.out.println(nickels + " nickles");
  System.out.println(pennies + " pennies ");
 }
} 


