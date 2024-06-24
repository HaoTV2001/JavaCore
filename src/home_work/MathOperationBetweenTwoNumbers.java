package home_work;

import java.util.Scanner;

public class MathOperationBetweenTwoNumbers {

  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int a, b;

    System.out.print("Input a: ");
    a = Integer.parseInt(scan.nextLine());
    System.out.print("Input b: ");
    b = Integer.parseInt(scan.nextLine());

    System.out.printf("%d + %d = %d", a, b, (a+b));
    System.out.printf("\n%d - %d = %d", a, b, (a-b));
    System.out.printf("\n%d * %d = %d", a, b, (a*b));
    System.out.printf("\n%d / %d = %.2f", a, b, (double)a/b);
  }
}
