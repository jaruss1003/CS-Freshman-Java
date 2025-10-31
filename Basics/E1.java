class E1 {
 public static void modifyArray(int[] a) {
 for(int i = 0; i <= a.length-1; i++)
 a[i] = a[i] + 1;
 }
 public static void main(String[] args) {
  int[] scores = {10, 25, 9, -16};
  modifyArray(scores);
  for (int j = 0; j <= scores.length-1; j++)
  System.out.println(scores[j]);
 }
}
