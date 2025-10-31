/**************************************************************************

 * @By: First and Last name

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 23, 2024

 * @Description: Modified version of Store 

 * **************************************************************************/
import java.util.Scanner;

class StoreSwitchNoBreak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
            case 1:
                total += 5;
            case 3:
                total += 5;
            case 2:
                total += 5;
                break;
            case 4:
                System.exit(0);
        }

        System.out.println("Your total is: $" + total);
        in.close();
    }
}
