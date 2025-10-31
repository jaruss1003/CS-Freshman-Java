/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 23, 2024

 * @Description: Another modified version. Includes a while loop and removes "System.exit(0)." 

 * **************************************************************************/

import java.util.Scanner;

class StoreSellMultipleItems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Setting up scanner
        int total = 0;
        int option = 0; // Initialize option

        while (option != 4) { // Loop until the user selects 'done' (option 4)
            System.out.println("Select one more product to purchase:");
            System.out.println("    1 - book $15");
            System.out.println("    2 - bag  $5");
            System.out.println("    3 - ball $10");
            System.out.println("    4 - done");
            System.out.print("Select an option: ");
            
            option = in.nextInt();

            switch (option) {
                case 1:
                    total += 5;
                case 3:
                    total += 5;
                case 2:
                    total += 5;
                    break;
                case 4:
                    break; // Break out of the loop when 'done' is selected
            }

            if (option != 4) { // Print the total so far, unless the user selected 'done'
                System.out.println("Your total so far is: $" + total);
            }
        }

        System.out.println("Your total is: $" + total); // Print the final total
        in.close(); // Close scanner when done using it
    }
}
