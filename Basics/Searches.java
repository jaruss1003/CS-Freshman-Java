/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 25

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 21, 2024

 * @Description: Call a random number and report whether or not it was found. 

 * **************************************************************************/
import java.util.Scanner;
import java.util.Random;

class Searches {
    // Sequential search is found in class slides
    static int sequentialSearch(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return i;
            }
        }
        return -1;
    }

    // Binary search is found in Canvas Files tab
    static int binarySearch(int[] haystack, int needle) {
        int low = 0;
        int high = haystack.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (haystack[mid] == needle) {
                return mid;
            } else if (needle < haystack[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // PrintArray is useful for debugging and easy to write by yourself as in previous labs
    static void printArray(int[] myArray) {
        for (int z : myArray) {
            System.out.print(z + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] myArray;
        int n, m, x, y, resultIndex;

        // Initialize scanner and random
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // Prompt and read n and m
        System.out.print("Enter Array Length: ");
        n = in.nextInt();
        System.out.print("Enter Upper Bound: ");
        m = in.nextInt();

        // Allocate myArray with n elements and fill its elements with random.nextInt(m)
        myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = random.nextInt(m);
        }

        // printArray(myArray); // Useful for debugging

        // Generate random values x and y, each of them with random.nextInt(m)
        x = random.nextInt(m);
        y = random.nextInt(m);

        // Sequential search
        resultIndex = sequentialSearch(myArray, x);
        // If resultIndex is -1, print absence of x; otherwise, announce finding it with sequential search
        if (resultIndex == -1) {
            System.out.println(x + " was not found by sequential search.");
        } else {
            System.out.println(x + " was found by sequential search at index " + resultIndex + ".");
        }

        // Sort the array for binary search
        java.util.Arrays.sort(myArray);

        // printArray(myArray); // Useful for debugging

        // Binary search
        resultIndex = binarySearch(myArray, y);
        // If resultIndex is -1, print absence of y; otherwise, announce finding it with binary search
        if (resultIndex == -1) {
            System.out.println(y + " was not found by binary search.");
        } else {
            System.out.println(y + " was found by binary search at index " + resultIndex + ".");
        }
    }
}
