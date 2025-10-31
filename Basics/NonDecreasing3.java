/**************************************************************************

 * @By: First and Last name

 * @Lab: 13

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 18, 2024

 * @Description: The program should determine if the integers are in non-decreasing order.

 * **************************************************************************/

import java.util.Scanner;

public class NonDecreasing3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int third = scanner.nextInt();

       
        if (first > second || second > third) {
            System.out.println("The integers are not in non-decreasing order");
        } else {
            System.out.println("The integers are in non-decreasing order");
            }
    }
}

