class A2 {
 public static void main (String []ars) { 
   int a[][] = {
   {1,2}, {3,4}, {5,6}  
  };

boolean square = true; 
   if (a != null && a.length > 0) {
   for (int col = 0; col < a.length; col ++) {

    if (a.length != a[col].length) {
     square = false; 
    }
   }
   if (square) {
    System.out.println("Square"); 
   } else { 
     System.out.println("Not Square");
     }  
      } else {
          System.out.println("Square"); 
        } 
 }
}
