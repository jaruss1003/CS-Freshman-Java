import java.util.Scanner;
public class Pie {
public static void main (String[]args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the radius");
double radius = keyboard.nextDouble();
double area = Math.PI * radius * radius;
System.out.println("Area of circle is:" + area); 

   }
}
