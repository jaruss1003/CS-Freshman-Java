import java.util.Scanner;

public class printName {

    public static void main(String args[]) {
        String s;
        Scanner keyboard = new Scanner(System.in);    // Creating a Scanner object

        // Loop to keep asking for input until it's valid
        while (true) {
            System.out.println("What is your name?");
            s = keyboard.next(); // Reading input

            // Check if the input contains only letters
            if (s.matches("[a-zA-Z]+")) {
                break; // Exit loop if input is valid
            } else {
                System.out.println("Invalid input. Please enter letters only.");
            }
        }

        System.out.print("So, your name is: ");
        System.out.println(s);  // Printing the valid input
    }
}
