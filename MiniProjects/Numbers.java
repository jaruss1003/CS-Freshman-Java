/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 1, 2024

 * @Description: The program calculates the sum, product, mean,and average distance from a list of posititve numbers

 * **************************************************************************/
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number_values, sum = 0, product = 1;
        double mean, sum_distances_from_mean = 0, avg_distances_from_mean;

        // Ask the number of values
        System.out.print("How many values: ");
        number_values = in.nextInt();

        // Allocate array
        int[] values = new int[number_values];

        // Input the values
        System.out.print("Enter values: ");
        for (int i = 0; i < number_values; i++) {
            values[i] = in.nextInt();
        }

        // Print the obtained values
        System.out.print("Values input were: ");
        for (int i = 0; i < number_values; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        // Compute sum and product
        for (int i = 0; i < number_values; i++) {
            sum += values[i];
            product *= values[i];
        }

        // Compute average
        mean = (double) sum / number_values;

        // Compute sum of absolute distances from mean
        for (int i = 0; i < number_values; i++) {
            sum_distances_from_mean += Math.abs(values[i] - mean);
        }

        // Compute average distance from mean
        avg_distances_from_mean = sum_distances_from_mean / number_values;

        // Print sum, product, mean and average distance from mean
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
        System.out.println("Mean is: " + mean);
        System.out.println("Average distance from the mean: " + avg_distances_from_mean);
    }
}
