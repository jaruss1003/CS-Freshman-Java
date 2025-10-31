/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 14, 2024

 * @Description: Prints the corresponding pattern

 * **************************************************************************/
import java.util.Scanner; 
public class Pattern {
  public static void print2DArray(char[][] array) {
     //  here implement the method body with the two nested loops
     for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
       System.out.print(array[i][j]);
      }
      System.out.println();
     } 
  }  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in); 
   //  read n
   System.out.print("Enter n: "); 
   int n = in.nextInt();
   char[][] myArray = new char[n][n];
     
   // TODO: for each row i
   for (int i = 0; i < myArray.length; i++) {
    // TODO:  for each column j
    for (int j = 0; j < myArray[i].length; j++) {
    // TODO:   if  i+j is odd, i.e., if((i+j)%2==1), then pattern[i][j] = '0', otherwise '-';
     if((i+j)%2==1) {
       myArray[i][j] = '0';
     } else { 
        myArray[i][j] = '-';
     }
    }
   }
   // TODO: print array by reusing method Grid.print2DArray from Task 1
   print2DArray(myArray);    
 }
}
