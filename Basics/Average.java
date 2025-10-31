import java.util.Scanner;

public class Average
{
public static void main(String[] args)
{
int n1, n2;
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter first number:");
n1 = keyboard.nextInt();


System.out.println("Enter second number:");
n2 = keyboard.nextInt();
System.out.println("Average:");
System.out.println((n1 + n2)/2);
}
}

