class IterSortRec {
 static void printA(int[]a) { 
  for (int i = 0; i < a.length; i++) 
   System.out.printf("%3d ", a[i]);
   System.out.println(); 
 }
 static void bubbleDown(int[]a, int elem) {
  int j  = elem , v = a[elem]; 
  while ((j>=1) && (v<a[j-1])) {
   a[j]=a[j-1];
   j=j-1;
  }
  a[j] = v;
 }
 static void iterSortRec(int[]a, int first) { 
 if (first >= a.length) return;
  bubbleDown(a, first);
  printA(a);
  iterSortRec(a, first + 1);
 }
 public static void main(String[] args) { 
  int[]a = {5,3,4,9,2,7,1,8};
  printA(a);
  iterSortRec(a, 0);
 } 
}
