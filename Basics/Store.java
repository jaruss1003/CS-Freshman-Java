/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 22, 2024

 * @Description: Calculates out the price of the items chosen. 

 * **************************************************************************/


import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Setting up scanner
        int total = 0;  
        int option = 0;         

        System.out.println("Select a product to purchase:");
        System.out.println("    1 - book $15");
        System.out.println("    2 - bag  $5");
        System.out.println("    3 - ball $10");
        System.out.println("    4 - cancel");
        System.out.print("Select an option: ");
     
        option = in.nextInt();

 
       switch (option) { 
       
         case (1) :
            total += 15;  // Note this can be written in Java as "total += 15;"
            break;
                   
         case (2) :
            total += 5;   // Note this can be written in Java as "total += 5;" 
            break; 
      
         case (3) :
            total += 10;
            break; 

         case (4) :
            System.exit(0); // Exit program
              
        
         default: 
            System.out.print("Unknown option: " + option);
            System.exit(0); // Exit program
              
        }

        System.out.println("Your total is: $" + total);
        in.close(); // Close scanner when done using it
    }
}
