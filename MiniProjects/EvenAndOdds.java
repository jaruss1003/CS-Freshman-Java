/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 20

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 5, 2024

 * @Description: Prints out the position and average of even and  odd numbers

 * **************************************************************************/
public class EvenAndOdds {
 public static void main(String[] args) {
  int[] myArray = { 97, 9, 52, 56, 50, 57, 52, 83, 31, 11, 93, 63, 31, 72, 52, 86, 28, 97, 70, 29, 97, 100, 99,
     68, 77, 41, 29, 90, 85, 88, 62, 43, 19, 49, 29, 77, 89, 31, 51, 53, 2, 28, 26, 95, 77, 53, 37, 35, 12,
     95, 58, 48, 15, 47, 64, 2, 34, 28, 91, 48, 49, 52, 64, 50, 19, 96, 10, 3, 63, 24, 15, 69, 29, 34, 85,
     67, 48, 19, 74, 8, 93, 62, 15, 49, 36, 91, 81, 37, 17, 88, 27, 68, 63 };

  int sum_evens = 0, count_evens = 0;
   // announce that you will print "Even Values: "
  System.out.println("Even Values:"); 
  //  in a cycle i from 0 to strictly less than myArray.length, if element is even, print&account element
  for (int i = 0; i < myArray.length; i++)  
  {
    //  test if element i even
      if (myArray[i] % 2 == 0)
     {
       count_evens++;            // this is accounting for the new found even
       sum_evens += myArray[i];  // here we are accounting for the new found even
       System.out.println(myArray[i] + " is at position " + i);
     }
  }
  //  Print even average, computed by dividing to count_evens the sum ((double)sum_evens)
  System.out.println("Average of even values is: " + ((double)sum_evens / count_evens));

  int sum_odds = 0, count_odds = 0;
  // announce that you will print even values
  System.out.println("Odd Values: ");
  //  in a cycle i from 0 to strictly less than array.length, if element is odd, print&account element
  for (int i = 0; i < myArray.length; i++) {
    if (myArray[i] % 2 != 0) {
     count_odds++;
     sum_odds += myArray[i];
     System.out.println(myArray[i] + " is at position " + i);
    }
  } 
  //  Print odd average, computed by dividing to count_odds the sum ((double)sum_odds)
  System.out.println("Average of odd values is: " + ((double)sum_odds / count_odds));
 }
}
