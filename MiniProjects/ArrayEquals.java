/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 20

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 5, 2024

 * @Description: Determines whether the two lists are identical.

 * **************************************************************************/
import java.util.Scanner;
public class ArrayEquals {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in); 
  int[] firstArray; 
 //  Read the desired arrays length
  System.out.print("Enter list length: ");
  int length = in.nextInt();

  //  Allocate the array space (firstArray = new int[length];)
  firstArray = new int[length]; 
  //  Prompt for the values of the first list
  System.out.print("Enter the first list: "); 
  //  in a cycle for i from 0 to the length: read and store the element i
  for (int i = 0; i < length; i++) {
   firstArray[i] = in.nextInt();
  }
  //  Prompt for the second list
  System.out.print("Enter the second list: ");
  boolean different = false;
  //  in a cycle for i from 0 to the length:
    for (int i = 0; i < length; i++) {
     //  read a value; then if different from first list element i, set variable different to true
     int value = in.nextInt();
     if (value != firstArray[i]) {
      different = true;
     }
    }
  //  if variable "different" not true, print that the lists are equal
    if (!different) {
     System.out.println("The lists are equal"); 
    }
  //  else, print that they are not equal
    else { 
     System.out.println("The lists are not equal");
    }
 }
}
