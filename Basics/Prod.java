class Prod {
 static public void main (String[] args) {
  int[] a={20,30,50},b={80,70,98},c;

  c = new int[3];
  

  for (int i = 0; i < c.length; i ++ ) {
   c[i] = a[i] * b[i];
  }
  
  for (int i = 0; i < c.length; i ++ ) {
   c[i] = a[i] < b[i] ? b[i] : a[i];
  } 
  
  for (int i = 0; i < c.length; i ++ ) {
   System.out.println(i +" " + a[i] + "#" + b[i] +  " => " + c[i]);
  }
 }
}
