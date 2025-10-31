/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 13

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 18, 2024

 * @Description: a modified version of NonDecreasing3 that tests if the three integers form the sides of a triangle. 

 * **************************************************************************/
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first integer: ");
        int first = scanner.nextInt();
        System.out.print("Input the second integer: ");
        int second = scanner.nextInt();
        System.out.print("Input the third integer: ");
        int third = scanner.nextInt();

        if (first > second || second > third) {
            System.out.println("The integers are not in non-decreasing order.");
            return;
        }

        if (first + second > third) {
            if (first == second && second == third) {
                System.out.println("The integers form an equilateral triangle.");
            } else if (first == second || second == third || first == third) {
                System.out.println("The integers form an isosceles triangle.");
            } else {
                System.out.println("The integers form a scalene triangle.");
            }
        }
    }
}

