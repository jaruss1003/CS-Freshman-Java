/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 21

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 7, 2024

 * @Description: This program will draw a random card out of the deck

 * **************************************************************************/
// TODO: program DrawCard headers
public class DrawCard {
 public static void main(String[] args) {
  java.util.Random generator = new java.util.Random();
  String suitName = null, cardName = null;   // text strings for suit and card
  int suitIndex, cardIndex;    // number representation if suit and card
  // use random to generate the suitIndex in interval [0..3] and the cardIndex in [0..12]
  suitIndex = generator.nextInt(4); 
  cardIndex = generator.nextInt(12); 
  // use switch or if to assign suitName to corresponding text
  switch (suitIndex) {
  
   case (0):
    suitName = "Diamonds";
    break;  
   case (1): 
    suitName = "Spades";
    break;  
   case (2): 
    suitName = "Clubs";
    break; 
   case (3): 
    suitName = "Hearts";
    break; 
  }
  //  use switch or if to assign cardName to corresponding text
  switch (cardIndex) {
    
   case 0 : 
    cardName = "Ace of ";
    break; 
   case (1): 
    cardName = "One of ";
    break; 
   case (2): 
    cardName = "Two of ";
    break; 
   case (3):
    cardName = "Three of ";
    break; 
   case (4): 
    cardName = "Four of ";
    break; 
   case (5): 
    cardName = "Five of ";
    break; 
   case (6):  
    cardName = "Six of ";
    break; 
   case (7):
    cardName = "Seven of ";
    break; 
   case (8): 
    cardName = "Eight of "; 
    break; 
   case (9): 
    cardName = "Nine of ";
    break; 
   case (10): 
    cardName = "Ten of ";
    break; 
   case (11): 
    cardName = "Jack of ";
    break; 
   case (12):
    cardName = "Queen of "; 
    break;
  }
  //  print the required final text, composed from suitName and cardName
  System.out.println(cardName + suitName); 
 }
}
