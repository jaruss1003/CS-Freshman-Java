/**************************************************************************
 * @By: Jacob Russ
 * @Lab: 26
 * @CSE 1001 Fund Software, Fall 2024
 * @Date: December 2, 2024
 * @Description: This program multiplies two integers recursively.
 **************************************************************************/

import java.util.Scanner;

public class RecursiveMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter a number: ");
        int b = in.nextInt();

        int result = recursiveMultiply(a, b);

        System.out.println(a + " x " + b + " = " + result);
    }

    public static int recursiveMultiply(int a, int b) {
        // Base case: If b equals 0, return 0
        if (b == 0) 
            return 0;

        // Here we exploit that a * b = a * (1 + (b - 1)) = a + a * (b - 1)
        // So do recursion call a + recursiveMultiply(a, b - 1)
        return a + recursiveMultiply(a, b - 1);
    }
}
