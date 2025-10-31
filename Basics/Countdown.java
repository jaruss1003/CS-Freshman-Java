/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 26

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 26, 2024

 * @Description: Preforms a countdown for n to 0

 * **************************************************************************/
import java.util.Scanner;
public class Countdown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = in.nextInt();

        recursiveCountdown(count);
    }

    public static void recursiveCountdown(int count) {

        if (count < 0) return;  // Base case

        System.out.println(count);

        recursiveCountdown(count - 1);
    }
}
