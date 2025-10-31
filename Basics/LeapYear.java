/**************************************************************************

 * @By: Jacob Russ

 * @Lab:13 

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 17, 2024

 * @Description: Determines if the year provided is a leap year or not. 

 * **************************************************************************/
public class LeapYear{
  public static void main (String[] args){
    int year = Integer.parseInt(args[0]);
    if (year % 4 == 0)
     if (year % 100 == 0)
      if (year % 400 == 0)
       System.out.println("Leap year");
      else
       System.out.println("Not a leap year");
     else
      System.out.println("Leap Year");
    else
     System.out.println("Not a leap year");
  }
}

