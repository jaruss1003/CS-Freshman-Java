/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 1, 2024

 * @Description: This program performs multiplication through repeated addition or subtraction based on user input, repeating until user opts to stop

 * **************************************************************************/
import java.util.Scanner;

class Product3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;

        System.out.print("Would you like to multiply? ");
        answer = in.next();

        while (answer.equals("yes")) {
            int a, b, result = 0;

            // Prompt user for two integers "a" and "b"
            System.out.print("Enter an integer: ");
            a = in.nextInt();
            System.out.print("Enter an integer: ");
            b = in.nextInt();

            // If a is positive, in a cycle from 0 to a-1, add b to result
            if (a > 0) {
                for (int i = 0; i < a; i++) {
                    result += b;
                }
            }
            // If a is negative, in a cycle from 0 to a+1, subtract b from result
            else {
                for (int i = 0; i < -a; i++) {
                    result -= b;
                }
            }

            // Print result and ask if to multiply more
            System.out.println(a + " x " + b + " = " + result);
            System.out.print("Would you like to multiply? ");
            answer = in.next();
        }
    }
}
