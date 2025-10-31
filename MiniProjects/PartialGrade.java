import java.util.Scanner;

class PartialGrade {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int count, studentGrade;
        double sum, average;
        int[] grades = new int[100];

        // Input the data
        count = 0;
        System.out.println("Enter grade:");
        studentGrade = kb.nextInt();

        while (studentGrade >= 0) {
            grades[count] = studentGrade;
            count = count + 1;
            System.out.println("Enter grade:");
            studentGrade = kb.nextInt();
        }

        // Calculate the sum
        sum = 0;
        for (int i = 0; i <= count - 1; i++) {
            sum = sum + grades[i];
        }

        // Calculate the average
        average = (double) sum / count;

        // Compare each grade with the average
        for (int i = 0; i <= count - 1; i++) { // Notice that grades.length is NOT used here.
            if (grades[i] < average) {
                System.out.println("Grade in position " + (i + 1) + " is < than average");
            } else {
                System.out.println("Grade in position " + (i + 1) + " is >= average");
            }
        }
    }
}
