class ArrayArg { 
 public static void showArray(char[] a) {
 for(int i = 0; i <= a.length-1; i++)
  System.out.println(a[i]);
 }
 public static void main(String[] args) {
  char[] grades ={'a','b','c'}; // new char[45];
  char[] status ={'x','y','z','t'}; // new char[20];
  int[] myInts ={0,1}; //new int[100];
// Generate random data for grades, status and myInts
  showArray(grades);
  showArray(status);
// showArray(myInts); --// What does this do?
 }
}
