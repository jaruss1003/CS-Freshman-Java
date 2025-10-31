/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 14, 2024

 * @Description: Print out an array with n rows and m columns in randomized binary values. 

 * **************************************************************************/
import java.util.Scanner;
import java.util.Random; 
public class AndOr {
  public static void print2DBoolean(boolean[][] array) {
     //  for all rows i
     for (int i = 0; i < array.length; i++) {
     // for all cols j
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j]?'1':'0');
      }
      System.out.println();
     }
  }

  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   Random random = new Random();
   //  read n
   System.out.print("Enter n: ");
   int n = in.nextInt(); 
   System.out.print("Enter m: "); 
   int m = in.nextInt(); 
   boolean[][] array1 = new boolean[n][m];
   boolean[][] array2 = new boolean[n][m];
   boolean[][] andArray = new boolean[n][m];
   boolean[][] orArray = new boolean[n][m];
   for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      array1[i][j] = random.nextBoolean();
      array2[i][j] = random.nextBoolean();
      andArray[i][j] = array1[i][j] && array2[i][j];
      orArray[i][j] = array1[i][j] || array2[i][j]; 
    }
   }
  System.out.println("First 2D Array: "); 
  print2DBoolean(array1); 

  System.out.println("Second 2D Array: ");
  print2DBoolean(array2); 

  System.out.println("\"And\" of the Arrays: ");
  print2DBoolean(andArray); 
  
  System.out.println("\"Or\" of the Arrays: ");
  print2DBoolean(orArray);

 }
}

       
