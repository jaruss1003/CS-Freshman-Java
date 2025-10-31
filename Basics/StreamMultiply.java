/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 28

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: December 5, 2024

 * @Description: Generates a stream with a mapper converting Strings to Integers and a reducer that returns the product closing the stream.

 * **************************************************************************/
class StreamMultiply {
 public static void main(String[] args) {
  int result =
    java.util.Arrays.stream(args)              // convert to stream of String
     .filter(x->{System.out.printf("'%s'=",x); return true;}) // print strings
     .map(x->Integer.parseInt(x))              // convert to stream of int
     .peek(x->{System.out.print(x+" ");})      // print ints
     .reduce(1,(x,y)->x*y);                    // reduce with identity 1
  System.out.println("->"+result);
 }
}
