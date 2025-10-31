/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 14, 2024

 * @Description: Prints out the corresponding pattern 

 * **************************************************************************/
import java.util.Scanner;
public class Grid { 

   // write a static method print2DArray(char[][] array) with nested loops to print a 2D array of chars
   public static void print2DArray(char[][] array) {
     //  here implement the method body with the two nested loops
     for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) { 
       System.out.print(array[i][j]); 
      } 
       System.out.println();
     }}
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter n: ");
       int n = in.nextInt(); 
        // Two dimensional array:
        char[][] myArray = new char[n][n];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = '*';
            }
        }

        // TODO: call the static method print2DArray(myArray); to print myArray
        print2DArray(myArray); 
    }

}
