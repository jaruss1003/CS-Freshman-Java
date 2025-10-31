/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 21

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 7, 2024

 * @Description: This program will draw a random card out of the deck using arrays

 * **************************************************************************/
public class DrawCard2 {
 public static void main(String[] args) {
  java.util.Random generator = new java.util.Random();
  String suitName = null, cardName = null;   // text strings for suit and card
  int suitIndex, cardIndex;    // number representation if suit and card
  // use random to generate the suitIndex in interval [0..3] and the cardIndex in [0..12]
  suitIndex = generator.nextInt(4); 
  cardIndex = generator.nextInt(12);
  String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
  suitName = suit[suitIndex];
  String[] card = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 
  cardName = card[cardIndex];
  System.out.println(cardName + " of " + suitName);
 } 
}
