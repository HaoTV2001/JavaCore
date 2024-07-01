package home_work_part_1;

import java.util.Scanner;

public class Exercise5 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double radius;

    while (true) {
      try {
        System.out.print("Input radius: ");
        radius = Double.parseDouble(scan.nextLine());
        if (radius <= 0) {
          System.out.println("Please input radius > 0!!!");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    System.out.println("=== Calculation results ===");
    System.out.printf("Perimeter of circle: %.2f", (2 * Math.PI * radius));
    System.out.printf("\nAcreage of circle: %.2f", (Math.PI * Math.pow(radius, 2)));
  }
}
