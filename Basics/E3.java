class E3 {
 public static void main(String [] args) { 
  int[] a = new int[3];
  int[] b = new int[3];
  for(int i=0; i <= a.length-1; i++)
   a[i] = 5;
  for(int i=0; i <= b.length-1; i++)
   b[i] = 5;
  if(b == a)
   System.out.println("a equals b");
  else
   System.out.println("a does not equal b");
 }
}
