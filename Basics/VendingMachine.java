/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 12

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 3, 2024

 * @Description: This program calculates how much of each coin denomination a given amount is. 

 * **************************************************************************/

import java.util.Scanner;
public class VendingMachine {
 public static void main(String[] args) {
  int amount, originalAmount, quarters, dimes, nickels, pennies;
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter an integer: ");
  amount = kb.nextInt();

  originalAmount = amount; // Save the original amount for later
  quarters = amount/25; // Determine the number of quarters
  amount = amount%25; // Extract the quarters
  dimes = amount/10; // Determine the number of dimes
  amount = amount%10; // Extract the dimes
  nickels = amount/5; // Determine the number of nickles
  pennies = amount%5; // Extract the nickles; leftover is pennies

  System.out.println(originalAmount + " cents in coins is: ");
  System.out.println(quarters + " quarters ");
  System.out.println(dimes + " dimes ");
  System.out.println(nickels + " nickles");
  System.out.println(pennies + " pennies ");
 }
} 




