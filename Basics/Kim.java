/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 14

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 20, 2024

 * @Description: Determines if Kim Kardashian will recieve a ticket, if so, it will state how much

 * **************************************************************************/

import java.util.Scanner;

class Kim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers");
        int x = in.nextInt();
        int y = in.nextInt();

        if (y  == 1) {
            x  -= 5;
        }

        if (x  <= 60) {
            System.out.println("no ticket");
        } else if (x  <= 80) {
            System.out.println("$100");
        } else {
            System.out.println("$200");
        }
    }
}
