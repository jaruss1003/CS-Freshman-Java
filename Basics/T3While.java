/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 1, 2024

 * @Description: The program prompts for a positive integer n and prints a descending pattern of numbers from n to 1 using two while loops

 * **************************************************************************/
// Typical program preamble and Scanner initialization reading n
import java.util.Scanner;

public class T3While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        int row = 1;
        while (row <= n) { // loop for row from 1 to n
            int col = n - row + 1; // initialize col based on row
            while (col >= 1) { // loop for col from n - row + 1 to 1
                System.out.print(col + " "); // print col
                col--; // decrement col
            }
            System.out.println(); // move to the next line after each row
            row++; // increment row
        }
    }
}
