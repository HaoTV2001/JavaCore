package home_work;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    LocalDate localDate = LocalDate.now();
    int yOB = 0;
    boolean validInput = false;

    do {
      try {
        System.out.print("Input your year of birth: ");
        yOB = Integer.parseInt(scan.nextLine());
        if (yOB >= localDate.getYear() || yOB < 1900) {
          System.out.println("Are you kidding me? Try again pls!");
        } else {
          validInput = true;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid year (type number).");
      }
    } while (!validInput);

    System.out.println("=== result ===");
    System.out.println("Your age: " + (localDate.getYear() - yOB));
  }
}
