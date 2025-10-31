/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 11

 * @CSE 1001 Fund Software

 * @Date: October 2, 2024

 * @Description: Finds the prefix of a word given a base.

 * **************************************************************************/

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word with a prefix: ");
        String word = in.next();

        System.out.print("Enter the word base: ");
        String base = in.next();

        int stopIndex = word.indexOf(base);
        String prefix = (stopIndex != -1) ? word.substring(0, stopIndex) : "";

        System.out.println("Prefix is: " + prefix);
    }
}
