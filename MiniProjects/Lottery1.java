/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 20

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 6, 2024

 * @Description: This program outputs the ticket numbers, and the total cost of the tickets

 * **************************************************************************/
import java.util.Scanner;

public class Lottery1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // start with typical headers for a program called Lottery1.java
        int ticketsNumber, tickets[][];

        // Read the desired number of tickets allocate the 2D array with ticketsNumber rows and 5 columns, for 5 numbers for ticket
        System.out.print("Enter number of tickets: ");
        ticketsNumber = scanner.nextInt();
        tickets = new int[ticketsNumber][5];

        // In a cycle for ticket i from 0 to ticketsNumber-1
        for (int i = 0; i < ticketsNumber; i++) {
            // Prompt for the values of the ticket i
            System.out.print("Enter ticket #" + (i + 1) + " (5 numbers, range 1 - 99): ");
            // in a cycle for j from 0 to 5: read and store the ticket i's number j
            for (int j = 0; j < 5; j++) {
                tickets[i][j] = scanner.nextInt();
            }
        }

        // Announce that you will display the read tickets,
        System.out.println("\nYour tickets are:");
        
        // in a cycle for i from 0 to ticketsNumber-1
        for (int i = 0; i < ticketsNumber; i++) {
            // Announce that you will print ticket i
            System.out.print("Ticket " + (i + 1) + ": ");
            // In a cycle for j from 0 while less than 5, print a separating space " ", followed by ticket i's number j
            for (int j = 0; j < 5; j++) {
                System.out.print(tickets[i][j] + " ");
            }
            System.out.println();
        }
        
        // After printing a new line, print total cost at $2 per ticket
        int totalCost = ticketsNumber * 2;
        System.out.println("\nTotal cost: $" + totalCost);
    }
}
