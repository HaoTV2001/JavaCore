package home_work;

import java.util.Scanner;

public class Exercise3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String productName;
    double unitPrice;
    int quantity;

    System.out.print("Input product name: ");
    productName = scan.nextLine();

    while (true) {
      try {
        System.out.print("Input unit price: ");
        unitPrice = Double.parseDouble(scan.nextLine());
        if (unitPrice <= 0) {
          System.out.println("Please input unit price > 0");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (true) {
      try {
        System.out.print("Input quantity: ");
        quantity = Integer.parseInt(scan.nextLine());
        if (quantity <= 0) {
          System.out.println("Please input quantity > 0");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    System.out.println("=== Results ===");
    System.out.println("Product name: " + productName);
    System.out.printf("Total amount: %.2f ", (unitPrice * quantity));
    System.out.printf("\nVAT: %.2f ", ((unitPrice * quantity) * 0.1));
  }
}
