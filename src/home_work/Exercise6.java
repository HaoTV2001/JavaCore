package home_work;

import java.util.Scanner;

public class Exercise6 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int licensePlates, score = 0;

    while (true) {
      try {
        System.out.print("Input number: ");
        licensePlates = Integer.parseInt(scan.nextLine());
        if (licensePlates < 9999 || licensePlates > 99999) {
          System.out.println("Please input license Plates > 0 AND include five number !!!");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (licensePlates != 0) {
      score += licensePlates % 10;
      licensePlates /= 10;
    }

    System.out.println("=== Calculation results ===");
    System.out.println("Score: " + (score % 10));
  }
}
