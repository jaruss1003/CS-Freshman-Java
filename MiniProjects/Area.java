/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 24

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: November 19, 2024

 * @Description: Will calculate the area of a geometric figure

 * **************************************************************************/
import java.util.Scanner;

class LotsOfArea {
  public static void main(String[] args) {
    String desireMore;
    double totalArea = 0; // Variable to store the total area
    Scanner scanner = new Scanner(System.in);

    // Ask if the user wants to calculate the area
    System.out.print("Would you like to calculate the area of a figure: ");
    desireMore = scanner.next();

    // Keep asking if the user wants to calculate more areas
    while (desireMore.equals("yes")) {
      double area = 0;  // Reset area for each iteration

      // Ask for the type of figure
      System.out.print("Enter type of figure (circle, triangle, or rectangle): ");
      String type = scanner.next();

      // Handle different types of figures
      switch (type) {
        case "circle":
          // Handle circle
          System.out.print("Enter radius: ");
          double radius = scanner.nextDouble();
          area = circleArea(radius);  // Calculate area of the circle
          break;
        case "triangle":
          // Handle triangle
          System.out.print("Enter base: ");
          double base = scanner.nextDouble();
          System.out.print("Enter height: ");
          double triangleHeight = scanner.nextDouble();
          area = triangleArea(base, triangleHeight);  // Calculate area of the triangle
          break;
        case "rectangle":
          // Handle rectangle
          System.out.print("Enter height: ");
          double rectangleHeight = scanner.nextDouble();
          System.out.print("Enter width: ");
          double width = scanner.nextDouble();
          area = rectangleArea(rectangleHeight, width);  // Calculate area of the rectangle
          break;
        default:
          // Handle invalid figure type
          System.out.println("Sorry, input must be circle, triangle, or rectangle.");
          continue;  // Go to the next iteration if the input is invalid
      }

      // Output the area of the figure
      System.out.println("Total area: " + area + " square inches");

      // Add the calculated area to the total area
      totalArea += area;

      // Ask if the user wants to calculate another area
      System.out.print("Would you like to calculate the area of another figure: ");
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
