package home_work_part_2;

import java.util.Scanner;
/**
 Giải phương trình bậc 1 có dạng: ax + b = 0.
 */
public class Exercise5 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = 0;
    double b = 0;

    while (true) {
      try {
        System.out.print("Enter coefficient a: ");
        a = Double.parseDouble(scan.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number for coefficient a!");
      }
    }

    while (true) {
      try {
        System.out.print("Enter coefficient b: ");
        b = Double.parseDouble(scan.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number for coefficient b!");
      }
    }

    if (a == 0) {
      if (b == 0) {
        System.out.println("The equation has infinitely many solutions.");
      } else {
        System.out.println("The equation has no solution.");
      }
    } else {
      double x = -b / a;
      System.out.println("The solution to the equation is: x = " + x);
    }
  }
}
