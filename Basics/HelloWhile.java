import java.util.Scanner; 
public class HelloWhile {
   public static void main (String[] args) {
int i, n;
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter N:");
n = keyboard.nextInt();
i = 1;
while (i <= n)
{
 System.out.println("Hello World!");
i = i + 1;
}
  }
}
