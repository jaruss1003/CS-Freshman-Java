import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.api.function.*;
import java.util.*;
import java.util.stream.*;
class MultiplyTest {

 // a test that with no parameters the product equals the identity: 1
 @Test
 void multiplyTest() {
  int r1 = Multiply.multiply();
  Assertions.assertEquals(1, r1, "Empty: identity");
 }

 // here we test that multiplication with 0 returns 0
 @Test
 void multiplyNullTest() {
  int r1 = Multiply.multiply(0,1,-1);
  Assertions.assertEquals(0, r1, "Null term");
 }

 // here we test that multiplication with negative numbers changes the sign
 @Test
 void multiplySignedTest() {
  int r1 = Multiply.multiply(1,1,-1,2,3,4,5);
  Assertions.assertEquals(1*1*-1*2*3*4*5, r1, "Multisign");
  r1 = Multiply.multiply(6,7,-1,1000,1000,1000);
  Assertions.assertEquals(6*7*-1*1000*1000*1000, r1, "Overflow");
 }

 // here we test that multiplications with 0 and with 2 work for all numbers from 1 to 5
 @ParameterizedTest
 @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
 void nullParametrizedMultiplyTest(int x) {
   Assertions.assertEquals(0, Multiply.multiply(0,x), "Value not null");
   Assertions.assertEquals(2*x, Multiply.multiply(2,x,1), "Evens not working");
 }

/* // uncomment this procedure if you have a recent java...
 // here we generate an infinite stream of tests of multiplications with identity from
 // an infinite stream on inputs and we instantiate it by limiting to 100 actual tests
 @TestFactory
 Collection<DynamicTest>  // A test factory's result type is a collection (i.e. list) of tests
 dynamicTestsFromStream2() { // the test method name is "dynamicTestsFromStream"
   return
       Stream.iterate(0, n -> n+1)  //an infinite stream started from 0, incrementing n
         .limit(100)       // the stream is limited filtering only the first 100 values
         .map(input ->     // for each value, generate a test
             DynamicTest.dynamicTest(
              "IDTest " + input, // each generated test has a name determined by the value
              // next we specify the test as a lambda (nameless) method using "input"
              () -> Assertions.assertEquals(input, Multiply.multiply(1, input), "identity test"))
          ).toList(); // a stream closing operator is used to determine the stream creation
 }
*/
}
