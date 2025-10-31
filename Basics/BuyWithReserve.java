public class BuyWithReserve {
        public static void main(String args[]){
                // declare a String variable called "firstArg"
                String firstArg;

                // set firstArg equal to the first command-line argument
                firstArg = args[0];                  // read the amount as text
                
                // convert firstArg to an int value
                int x = Integer.parseInt(firstArg);
                x = x + 15;                        // here we increase the amount by 15

                // Declare and assign y to the second command-line argument (the action)
                String y = args[1];
                
                // Print out y (action), x (increased amount), along with the third command-line argument describig the item
                System.out.println(y + " " + x + " " + args[2]);
        }
}
                
