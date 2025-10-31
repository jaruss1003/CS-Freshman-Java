/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 21

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 7, 2024

 * @Description: This program will draw n number of random cards out of the deck using arrays

 * **************************************************************************/
import java.util.Scanner; 
public class DrawNcards {
 public static void main(String[] args) {
  java.util.Random generator = new java.util.Random();
  Scanner in = new Scanner(System.in); 
  String suitName = null, cardName = null;   // text strings for suit and card
  int suitIndex, cardIndex;    // number representation if suit and card
  // use random to generate the suitIndex in interval [0..3] and the cardIndex in [0..12]
  System.out.print("How many cards would you like: ");
  int cardNumber = in.nextInt();
  String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
  String[] card = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 
  for (int i = 0; i < cardNumber; i++) {  
   suitIndex = generator.nextInt(4);
   cardIndex = generator.nextInt(12);
   suitName = suit[suitIndex];
   cardName = card[cardIndex];
   System.out.println(cardName + " of " + suitName);
  }
 } 
}
