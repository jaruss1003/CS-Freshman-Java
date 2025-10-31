/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 27

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: December 4, 2024

 * @Description: A program using GetOpt that converts from one measurement to another. 

 * **************************************************************************/
class MyConvert {
 public static void printHelp() {
  System.out.println("\tUsage: java MyConvert [-c centimeters|-i inches|-m meters|-f feet]");
  System.out.println("\t\t-C // convert to centimeters (cm)");
  // print remaining options descriptions
  System.out.println("\t\t-F // convert to feet (cm/(12*2.54))");
  System.out.println("\t\t-I // convert to inches (cm/2.54)");
  System.out.println("\t\t-M // convert to meters (cm/100)");
  System.out.println("\t\t-h // convert to centimeters (cm)");
 }
 public static void main (String[]args) {
  double input_in_centimeters = 0;
  boolean inputProvided = false;
  boolean desired_cm = false, desired_in = false, desired_ft = false, desired_m = false;
  char c;
  //  in a cycle while c = ... GetOpt.getopt ...parses args by pattern "hi:c:f:m:ICFM"
  while((c = GetOpt.getopt(args, "hi:c:f:m:ICFM"))!= GetOpt.END) {
   //  switch by the option currently parsed
   switch(c) {
   case 'c': inputProvided = true; input_in_centimeters = Double.parseDouble(GetOpt.optarg)*1; break;
   //  case 'i', case 'f', case 'm', then set inputProvided to true
   //       and read input_in_centimeters from GetOpt.optarg
   //       with Double.parseDouble() and appropriate conversion to centimeters (*2.54,...)
   case 'i': inputProvided = true; input_in_centimeters = Double.parseDouble(GetOpt.optarg)*2.54; break;
   case 'f': inputProvided = true; input_in_centimeters = Double.parseDouble(GetOpt.optarg)*12*2.54; break; 
   case 'm': inputProvided = true; input_in_centimeters = Double.parseDouble(GetOpt.optarg)*100; break;  
   case 'C': desired_cm = true; break;
   //  case I, F, M, set the corresponding desired_xx variable to true
   case 'I': desired_in = true; break; 
   case 'F': desired_ft = true; break; 
   case 'M': desired_m = true; break; 
   //  case '?' or ':' display error message and help with printHelp() and exit
   case '?': System.out.println("?:"+GetOpt.optopt); printHelp(); System.exit(1);
   //  case 'h' display help text with our printHelp(), and exit with System.exit(1);
   case 'h': System.out.println("?:"+GetOpt.optopt); printHelp(); System.exit(1);
   }
  }
  if (! inputProvided) {
    //  error message saying that input is missing and print help
    System.out.println("Error: no input provided with -c -i -m or -f"); printHelp(); 
  }
  if (desired_cm) {
   System.out.println("Centimeters: "+input_in_centimeters);
  }
  if (desired_in) {
   System.out.println("Inches: "+input_in_centimeters/2.54);
  }
  // TODO: similarly treat cases where desired_ft or desired_m
  if (desired_ft) { 
   System.out.println("Feet: "+input_in_centimeters/12/2.54); 
  }
  if (desired_m) { 
   System.out.println("Meters: "+input_in_centimeters/100); 
  }
 }
}
