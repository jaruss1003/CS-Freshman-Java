/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 24

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 20, 2024

 * @Description: Performs a binary search

 * **************************************************************************/

import java.util.Scanner;

class binarySearch {
    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            // Print the current search status
            printBinarySearchStatus(a, low, mid, high);

            if (a[mid] == x) {
                return mid;
            } else if (x < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // Value not found
    }

    // Method to print the status of the binary search
    public static void printBinarySearchStatus(int[] array, int low, int mid, int high) {
        System.out.printf("low=%2d  mid[%2d]=%2d  high=%2d\n", low, mid, array[mid], high);
    }

    public static void main(String[] pars) {
        Scanner scanner = new Scanner(System.in);

        // Define the array of values
        int[] array = {2, 4, 5, 7, 10, 12, 14, 18, 21, 23, 25, 26, 29, 30, 32, 35, 45, 51, 56, 62, 64, 66, 79, 80, 83};

        // Prompt the user for the value to search
        System.out.print("Enter the number you search for: ");
        int x = scanner.nextInt();

        // Call binary search
        int position = binarySearch(array, x);

        // Output the result
        if (position >= 0) {
            System.out.println("Found: " + position);
        } else {
            System.out.println("Value does not appear in the array");
        }
    }
}
