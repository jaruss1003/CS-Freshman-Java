/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 22

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 12, 2024

 * @Description: Converts the number input into text form

 * **************************************************************************/
// An example with functions that return strings and call each other.
//
// This program will input an integer in the range 0 < n < 100000, and output
// the English equivalent. For example, if 732825 is input, then the output
// will be "seven hundred thirty two thousand eight hundred twenty five"
// 
// All methods work ONLY for values in the range specified.
// Calling ANY of the methods with values outside the specfied range
// will produce errors.
//
import java.util.*;

public class anglicize {

   public static Scanner kb = new Scanner(System.in);

   // Outputs the english equivalent of n, for 0 < n < 1000000
   public static void main(String[] args) {
      int x;
      String s;

      System.out.print("Enter a postive integer:");
      x = kb.nextInt();
      if (x <= 0)
         System.out.println("Number is too small");
      else if (x >= 1000000)
         System.out.println("Number is too large");
      else {
         s = anglicize1(x);
         System.out.println(s);
      }
   }
   
   // Returns the english equivalent of n, for 0 < n < 1000000
   public static String anglicize1(int n) {
      String s;

      if (n < 1000)
         s = anglicize2(n);
      else
         s = anglicize2(n/1000) + "thousand " + anglicize2(n%1000);

      return s;
   }
  
   // Returns the english equivalent of n, for 0 < n < 1000
   public static String anglicize2(int n) {
      String s;

      if (n < 100)
         s = anglicize3(n);
      else
         s = digitName(n/100) + "hundred " + anglicize3(n%100);

      return s;
   }
   
   // Returns the english equivalent of n, for 0 < n < 100
   public static String anglicize3(int n) {
      String s;

      if (n < 10)
         s = digitName(n);
      else if (n < 20)
         s = teenName(n);
      else // n >= 20
         s = tensName(n/10) + digitName(n%10);

      return s;
   }

   // Returns the english equivalent of 10*n, for 2 <= n <= 9
   public static String tensName(int n) {
       return switch (n) {
           case 2 -> "twenty ";
           case 3 -> "thirty ";
           case 4 -> "forty ";
           case 5 -> "fifty ";
           case 6 -> "sixty ";
           case 7 -> "seventy ";
           case 8 -> "eighty ";
           default -> "ninety ";
       };
   }
   
   // Returns the english equivalent of n, for 10 <= n <= 19
   public static String teenName(int n) {
       return switch (n) {
           case 10 -> "ten ";
           case 11 -> "eleven ";
           case 12 -> "twelve ";
           case 13 -> "thirteen ";
           case 14 -> "fourteen ";
           case 15 -> "fifteen ";
           case 16 -> "sixteen ";
           case 17 -> "seventeen ";
           case 18 -> "eighteen ";
           default -> "nineteen ";
       };
   }

   // Returns the english equivalent of n, for 0 < n < 10
   // Returns "", if n = 0
   public static String digitName(int n) {
       return switch (n) {
           case 0 -> "";
           case 1 -> "one ";
           case 2 -> "two ";
           case 3 -> "three ";
           case 4 -> "four ";
           case 5 -> "five ";
           case 6 -> "six ";
           case 7 -> "seven ";
           case 8 -> "eight ";
           default -> "nine ";
       };
   }
}

// How could this be extended to work for numbers >=1000000, =0 or <0?
   

