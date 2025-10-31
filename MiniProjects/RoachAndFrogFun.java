/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 18

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 29, 2024

 * @Description: Determines amount of frogs and roaches to fill house 

 * **************************************************************************/

import java.util.Scanner;

class RoachAndFrogFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double GROWTH_RATE = 0.95; 
        double ONE_BUG_VOLUME = 0.002;
        double FROG_GROWTH_RATE; 
        double ONE_FROG_VOLUME;

        double houseVolume, population, totalBugVolume, populationFrogs, totalFrogVolume;

        // Initial user input
        System.out.print("Enter total house volume (cubic feet): ");
        houseVolume = keyboard.nextDouble();

        System.out.print("Enter initial number of roaches: ");
        population = keyboard.nextDouble();

        // NEW READS
        // Read Initial number of frogs
        System.out.print("Enter initial number of frogs: ");
        populationFrogs = keyboard.nextDouble();

        // Read Volume of an individual frog
        System.out.print("Enter volume of an individual frog: ");
        ONE_FROG_VOLUME = keyboard.nextDouble();

        // Read Reproductive rate of the frogs
        System.out.print("Enter reproductive rate of the frogs: ");
        FROG_GROWTH_RATE = keyboard.nextDouble();

        // Read number of roaches per week that an individual frog can consume
        System.out.print("Enter number of roaches per week that an individual frog can consume: ");
        double bugsEatenByAFrogPerWeek = keyboard.nextDouble();

        System.out.println();
        System.out.println("House volume: " + houseVolume + " cubic feet");
        System.out.println("Initial roach population: " + population);
        System.out.println("Initial frog population: " + populationFrogs);
        System.out.println();

        int countWeeks = 0;
        totalBugVolume = population * ONE_BUG_VOLUME; // Initialize total bug volume
        totalFrogVolume = populationFrogs * ONE_FROG_VOLUME; // Initialize total frog volume

        // Main loop to simulate population growth
        while (totalBugVolume + totalFrogVolume < houseVolume) { // Check if house is full
            countWeeks++; // Increment week count

            // Update population of roaches
            population += (GROWTH_RATE * population);

            // Update population of frogs
            populationFrogs += (FROG_GROWTH_RATE * populationFrogs);

            // Calculate the number of roaches eaten by frogs
            double roachesEatenByFrogs = populationFrogs * bugsEatenByAFrogPerWeek;
            population -= roachesEatenByFrogs; // Directly reduce the population of roaches
            
            // Ensure population doesn't go negative
            if (population < 0) {
                population = 0;
            }

            // Update volumes based on the populations
            totalBugVolume = population * ONE_BUG_VOLUME; // Update total roach volume
            totalFrogVolume = populationFrogs * ONE_FROG_VOLUME; // Update total frog volume

            // Print information for the current week
            System.out.println("Week " + countWeeks + ":");
            System.out.println("Number of roaches: " + (int)population);
            System.out.println("Total roach volume: " + totalBugVolume + " cubic feet");
            System.out.println("Number of frogs: " + (int)populationFrogs);
            System.out.println("Total frog volume: " + totalFrogVolume + " cubic feet");
            System.out.println("Total volume (roaches + frogs): " + (totalBugVolume + totalFrogVolume) + " cubic feet\n");
        }

        // Final output
        System.out.println("The house will be filled in " + countWeeks + " weeks.");
        System.out.println("Final number of roaches: " + (int)population);
        System.out.println("Final total volume of roaches: " + totalBugVolume + " cubic feet.");
        System.out.println("Final number of frogs: " + (int)populationFrogs);
        System.out.println("Total Volume: " + (totalBugVolume + totalFrogVolume) + " cubic feet.");
    }
}
