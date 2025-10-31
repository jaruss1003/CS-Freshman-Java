import java.util.Scanner;
class Kardashian {
 public static void main (String[] args) {
   Scanner in = new Scanner(System.in);

   System.out.print("Enter attendees: ");
   int attendees = in.nextInt();
   System.out.print("Enter week day: ");
   int weekday = in.nextInt();
   
   if (weekday % 6 == 0 && attendees >= 40 ) {
      System.out.println("Successful");
   } else if ( attendees >= 40 && attendees <= 60 ) {
     System.out.println("Successful");
   } else 
     System.out.println("Unsuccessful");
 
 }
} 
