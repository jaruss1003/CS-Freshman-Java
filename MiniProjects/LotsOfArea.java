/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 24

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 19, 2024

 * @Description: Will calculate the area of a geometric figure

 * **************************************************************************/
import java.util.Scanner;

class LotsofArea {
  public static void main(String[] args) {
    String type, desireMore;
    double totalArea = 0;  // Declare totalArea to accumulate the total area
    Scanner scanner = new Scanner(System.in);

    // Ask if the user wants to calculate the area
    System.out.print("Do you want to calculate the area of a figure (yes/no)? ");
    desireMore = scanner.next();

    // Keep asking if the user wants to calculate more areas
    while (desireMore.equals("yes")) {
      double area = 0;  // Reset area for each iteration

      // Ask for the type of figure
      System.out.print("Enter type of figure (circle, triangle, or rectangle): ");
      type = scanner.next();

      // Handle different types of figures
      switch (type) {
        case "circle":
          // Handle circle
          System.out.print("Enter radius: ");
          double radius = scanner.nextDouble();
          area += circleArea(radius);  // Add the area of the circle to total area
          break;
        case "triangle":
          // Handle triangle
          System.out.print("Enter base: ");
          double base = scanner.nextDouble();
          System.out.print("Enter height: ");
          double triangleHeight = scanner.nextDouble();  // Renamed variable to avoid conflict
          area += triangleArea(base, triangleHeight);  // Add the area of the triangle
          break;
        case "rectangle":
          // Handle rectangle
          System.out.print("Enter height: ");
          double rectangleHeight = scanner.nextDouble();  // Renamed variable to avoid conflict
          System.out.print("Enter width: ");
          double width = scanner.nextDouble();
          area += rectangleArea(rectangleHeight, width);  // Add the area of the rectangle
          break;
        default:
          // Handle invalid figure type
          System.out.println("Sorry, input must be circle, triangle, or rectangle.");
          return;  // Exit if the input is invalid
      }

      // Add the calculated area to the total area
      totalArea += area;

      // Ask if the user wants to calculate another area
      System.out.print("Do you want to calculate another area (yes/no)? ");
      desireMore = scanner.next();
    }

    // Output the total area after the user decides to stop
    System.out.println("Area of All Figures: " + totalArea + " square inches");
  }

  // Method for calculating circle area
  static double circleArea(double radius) {
    return Math.PI * (radius * radius);  // Formula for circle area: π * r^2
  }

  // Method for calculating triangle area
  static double triangleArea(double base, double height) {
    return (base * height) / 2;  // Formula for triangle area: (base * height) / 2
  }

  // Method for calculating rectangle area
  static double rectangleArea(double height, double width) {
    return height * width;  // Formula for rectangle area: height * width
  }
}
