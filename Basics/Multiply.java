import java.util.Scanner;
class Multiply {
public static void main (String args[]) {

  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter the first number");
  double a = keyboard.nextDouble();
  System.out.println("Enter the second number");
  double b = keyboard.nextDouble();
  double product = a * b;
 
 System.out.println("The product is:" + product);
 }
}
