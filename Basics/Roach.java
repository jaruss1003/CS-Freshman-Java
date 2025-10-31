public class Roach {
public static void main(String[] args) {
java.util.Scanner keyboard = new java.util.Scanner(System.in);
final double GROWTH_RATE = 0.95;
final double ONE_BUG_VOLUME = 0.002;
double houseVolume, population, totalBugVolume;
System.out.print("Enter total house volume (cubic feet):");
houseVolume = keyboard.nextDouble();
System.out.print("Enter initial number of roaches:");
population = keyboard.nextDouble();
System.out.println();
System.out.println("House volume:" + houseVolume + " cubic feet");
System.out.println("Initial population:" + population);
System.out.println();

int countWeeks = 0;
totalBugVolume = population * ONE_BUG_VOLUME;
while (totalBugVolume < houseVolume) {
System.out.println("Current week: "+countWeeks);
population = population + (GROWTH_RATE * population);
totalBugVolume = population * ONE_BUG_VOLUME;
countWeeks = countWeeks + 1;
}
System.out.println("The house will be filled in " + countWeeks + " weeks.");
System.out.println("There will be " + (int)population + " roaches.");
System.out.println("They will fill " + totalBugVolume + " cubic feet.");
}
}
