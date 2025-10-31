/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 1, 2024

 * @Description: The program prompts for a positive integer n and prints a descending pattern of numbers from n to 1.

 * **************************************************************************/

import java.util.Scanner;

public class T3For {
    public static void main(String[] args) {
        // Write typical program preamble and Scanner initialization reading n
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a positive integer n (n >= 1)
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Ensure the input is valid (n >= 1)
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than or equal to 1.");
            return; // Exit if input is invalid
        }

        // In a cycle for row from 1 to n
        for (int row = 1; row <= n; row++) {
            // In a cycle for col from n - row + 1 to 1
            for (int col = n - row + 1; col >= 1; col--) {
                // print col
                System.out.print(col + " "); // Print the column number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
