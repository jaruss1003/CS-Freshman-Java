class order {
static int param1() {
System.out.println("Param1");
return 1;
}
static int param2() {
System.out.println("Param2");
return 2;
}
static int caller(int p1, int p2) {
return p1 + p2;
}

static int x = 10,
            y = 20,
            z = 30,
            u = 15,
            v = 4 ;

       static  int result ;
public static void main (String[] args) {
 System.out.println("x = " + x + ", y = " + y + ", z = " + z) ;
        result = -x-- - -++y * --z % 2 ;
System.out.println("-x-- - -++y * --z % 2 = " + result) ;
 x = 10 ;
        System.out.println("x = " + x) ;
        result = -x-- - -++x * --x % 2 ;
        System.out.println("-x-- - -++x * --x % 2 = " + result) ;
        System.out.println("x = " + x) ;
        System.out.println() ;
String s1 = "hello";
String s2 = "hello";
if (s1.equals (s2) )
System.out.println("Strings are equal!");
else
System.out.println("Strings are not equal!") ;

System.exit(caller(param1(), param2()));
}
}

