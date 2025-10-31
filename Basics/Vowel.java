/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 18

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 29, 2024

 * @Description: Determine whether the characters in a line are vowels or consonants

 * **************************************************************************/
import java.util.Scanner; 
public class Vowel {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a Line of Text: "); 
  String line = in.nextLine();
  String lowerCaseLine = line.toLowerCase();
  for (int i = 0; i < line.length(); i ++) {
   char lowerCaseChar = lowerCaseLine.charAt(i);
   switch(lowerCaseChar){
    case 'a': 
    case 'u':
    case 'i':
    case 'o':
    case 'e':
   System.out.println(line.charAt(i) + " is a vowel");
   break;
  default:
   if (lowerCaseChar >= 'b' && lowerCaseChar <= 'z') {
    System.out.println(line.charAt(i) + " is a consonant");
   } else {
         System.out.println(line.charAt(i) + " is some other character");
     }
   }
  }
 }
}

