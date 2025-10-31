/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 22, 2024

 * @Description: Modified version of TrafficLight 1. Input is accepted regardless of capitalization.  

 * **************************************************************************/

import java.util.Scanner;
public class TrafficLight2 {
 static public void main (String args[]) {
 Scanner in = new Scanner(System.in);
 System.out.print("Enter a light color: ");
 String x = in.next();
 String y = x.toLowerCase();
 

 switch (y) {
       case "red" : System.out.println("Stop");
             break;
       case "yellow" : System.out.println("Slow");
             break;
       case "green" : System.out.println("Go");
             break;
       default : System.out.println("Unknown");
             break;
}
 }
}
