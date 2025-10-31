class MySwitch {
 public static void main(String[] args) {
  int y = 5, z = 1;
  int x = 0;
   switch (x) {
case 0:
   System.out.println("zero"); x = x * 10;
   break;
case 1:
System.out.println("one");
y = 0;
z = x * 20; case 5:
System.out.println("five");y = 10;
x = x * 15; default:
System.out.println("default case");
x = 30;
}
  }
}
