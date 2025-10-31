/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 22, 2024

 * @Description: Depending on the input, the program will display, stop, slow, go, or unknown.

 * **************************************************************************/
import java.util.Scanner;
public class TrafficLight1 {
 static public void main (String args[]) {
 Scanner in = new Scanner(System.in);
 System.out.print("Enter a light color: "); 
String x = in.next();


switch (x) {
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
