class FibNonRec { 
 public static void main(String[] args) { 
  int n = 9;
  if (n == 0) {
   System.out.print(0+ " ");
   return; 
  } 
  if (n == 1) { 
   System.out.print(1+ " "); 
   return; 
 } 
  int oldestVal = 0;
  int lastVal = 1;
  int currentVal = lastVal + oldestVal;
  for(int i = 2; i < n; i++) {
   oldestVal = lastVal;
   lastVal = currentVal;
   currentVal = oldestVal + lastVal;
  }
  System.out.println(currentVal);
 }
}
