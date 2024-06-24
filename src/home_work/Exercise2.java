package home_work;

import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a, b;

    while (true) {
      try {
        System.out.print("Input a: ");
        a = Integer.parseInt(scan.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (true) {
      try {
        System.out.print("Input b: ");
        b = Integer.parseInt(scan.nextLine());
        if (b == 0) {
          System.out.println("Cannot divide by zero! Please input b != 0");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    System.out.println("=== Calculation results ===");
    System.out.printf("%d + %d = %d", a, b, (a + b));
    System.out.printf("\n%d - %d = %d", a, b, (a - b));
    System.out.printf("\n%d * %d = %d", a, b, (a * b));
    System.out.printf("\n%d / %d = %.2f", a, b, (double) a / b);
  }
}
