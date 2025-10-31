class Grades {
static java.util.Scanner kb = new java.util.Scanner(System.in); 
 static public void main (String []args) {
  int[] grades;
  int n, sum;
  double avg;
// Input the number of grades from the user
   System.out.print("Enter # of Grades:");
   n = kb.nextInt();

// Allocate the array

   grades = new int[n];

// Input the grades into the array

   for (int i=0; i<=grades.length-1; i++) {
    System.out.print("Enter grade:");
    grades[i] = kb.nextInt();
  }

// Add up all the grades

   sum = 0;
   for (int i=0; i<=grades.length-1; i++)
    sum = sum + grades[i];

// Calculate and output the average

   avg = (double)sum/n;
   System.out.println();
   System.out.println("The average is: " + avg);


// Compare each grade to the average

   for (int i=0; i<=grades.length-1; i++) {
    if (grades[i] > avg)
    System.out.println("Student #" + (i+1) + " is above average");
   else if (grades[i] < avg)
    System.out.println("Student #" + (i+1) + " is below average");
   else
    System.out.println("Student #" + (i+1) + " is average");
   }
 }
}
