class Test {
 public static int hello() {
  System.out.println("Hello");
  return 0; 
 } 
 static int x = hello();
 public static void main(String[]args) { 
  System.out.println("Main");
  hello(); 
 }
}
