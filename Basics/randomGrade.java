import java.util.Random;
public class randomGrade {
 public static void main (String[] args) {
  char[] grades = new char[20];
  Random generator = new Random();
  for (int i=0; i<=grades.length-1; i++)
  grades[i] = (char)('A' + generator.nextInt(5));
  for (int i=0; i<=grades.length-1; i++)
  System.out.println(grades[i]);
 }
}
