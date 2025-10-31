class Str { 
 static int sum(Integer... ops) {
  return java.util.Arrays.stream(ops).reduce(0,(a,b) -> a+b);
 } 
 static public void main(String[] args) { 
  System.out.println(sum(1,2,3,4));
 } 
}
