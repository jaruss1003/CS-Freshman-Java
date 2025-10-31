/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 15, 2024

 * @Description: The program reads a 2D array, mirrors each row, and prints the transformed array. 

 * **************************************************************************/
import java.util.Scanner;

public class Scroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = scanner.nextInt();

        // declare a 2D array of int called myArray
        int[][] myArray = new int[rows][cols];

        // read the 2D array from the user
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter row " + i + ": ");
            for (int j = 0; j < cols; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }

        // Now call scroll on myArray
        scroll(myArray);
        System.out.println("The scrolled array is:");
        print2DInt(myArray);
    }

    public static void print2DInt(int[][] array) {
        // for all rows i
        for (int i = 0; i < array.length; i++) {
            // for all cols j
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void scroll(int[][] array) {
        // for each row i
        for (int i = 0; i < array.length; i++) {
            // save the last element in the row (at [row].length-1) into a variable "int temp"
            int temp = array[i][array[i].length - 1];
            // for each col j from the array[i].length-1, down to 1
            for (int j = array[i].length - 1; j > 0; j--) {
                // assign to position array[i][j] the value at array[i][j-1] (scrolling to the right)
                array[i][j] = array[i][j - 1];
            }
            // at col 0 place the value stored in temp
            array[i][0] = temp;
        }
    }
}
