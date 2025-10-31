/**************************************************************************

 * @By: Jacob Russ

 * @Lab: Lab 25

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 21, 2024

 * @Description: Compares sequential and binary search performance by timing and counting successful searches.

 * **************************************************************************/
import java.util.Scanner;
import java.util.Random;

class Searches2 {
    // Sequential search implementation
    static int sequentialSearch(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return i;
            }
        }
        return -1;
    }

    // Binary search implementation
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

    public static void main(String[] args) {
        int[] myArray;
        int n, m, k, x, y, resultIndex, foundSequential = 0, foundBinary = 0;

        // TODO: initialize scanner and random
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // TODO: prompt and read n and m
        System.out.print("Enter Array Length: ");
        n = in.nextInt();
        System.out.print("Enter Upper Bound: ");
        m = in.nextInt();

        // TODO: allocate myArray with n elements and fill its elements with random.nextInt(m)
        myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = random.nextInt(m);
        }

        // printArray(myArray); // useful for debugging

        // TODO: read k
        System.out.print("Enter Number of Searches: ");
        k = in.nextInt();

        long startSequential = System.nanoTime();
        // in a cycle k times
        for (int i = 0; i < k; i++) {
            // TODO: generate random value x, random.nextInt(m)
            x = random.nextInt(m);

            resultIndex = sequentialSearch(myArray, x);
            // TODO: if resultIndex is not -1 do foundSequential++
            if (resultIndex != -1) {
                foundSequential++;
            }
        }
        long endSequential = System.nanoTime();
        System.out.println("Sequential Search Running Time: " + (endSequential - startSequential) + "ns");
        // TODO: print the report for sequential search found ratio
        System.out.println("Total Number of Successful Sequential Searches: " + foundSequential);

        long startBinary = System.nanoTime();
        java.util.Arrays.sort(myArray); // only a sorted array can be used with binary search
        // printArray(myArray); // useful for debugging

        // in a cycle k times
        for (int i = 0; i < k; i++) {
            // TODO: generate random value y, random.nextInt(m)
            y = random.nextInt(m);

            resultIndex = binarySearch(myArray, y);
            // TODO: if resultIndex is not -1 do foundBinary++
            if (resultIndex != -1) {
                foundBinary++;
            }
        }
        long endBinary = System.nanoTime();
        System.out.println("Binary Search Running Time: " + (endBinary - startBinary) + "ns");
        // TODO: print the report for binary search found ratio
        System.out.println("Total Number of Successful Binary Searches: " + foundBinary);
    }
}
