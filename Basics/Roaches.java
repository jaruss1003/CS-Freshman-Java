/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 23, 2024

 * @Description: Modified version of Roaches that uses a for loop instead of a while loop  

 * **************************************************************************/
import java.util.Scanner;

class Roaches {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final double GROWTH_RATE = 0.95;
        final double ONE_BUG_VOLUME = 0.002;

        double houseVolume, population, totalBugVolume;

        System.out.print("Enter total house volume (cubic feet): ");
        houseVolume = keyboard.nextDouble();
        System.out.print("Enter initial number of roaches: ");
        population = keyboard.nextDouble();

        System.out.println();
        System.out.println("House volume: " + houseVolume + " cubic feet");
        System.out.println("Initial population: " + population);
        System.out.println();

        int countWeeks = 0;

        for (totalBugVolume = population * ONE_BUG_VOLUME; totalBugVolume < houseVolume; countWeeks++) {
            population = population + (GROWTH_RATE * population);
            totalBugVolume = population * ONE_BUG_VOLUME;
        }

        System.out.println("The house will be filled in " + countWeeks + " weeks.");
        System.out.println("There will be " + (int)population + " roaches.");
        System.out.println("They will fill " + totalBugVolume + " cubic feet.");
    }
}
