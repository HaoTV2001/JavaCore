package home_work_part_2;

import java.util.Scanner;
/**
 * Nhập vào 2 số nguyên, lưu vào 2 biến a và b. đảo giá trị của 2 biến này rồi xuất
 * giá trị của chúng ra màn hình console.
 */
public class Exercise3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number_1, number_2;

    while (true) {
      try {
        System.out.print("Input number_1: ");
        number_1 = Integer.parseInt(scan.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Please input valid number_1 !");
      }
    }

    while (true) {
      try {
        System.out.print("Input number_2: ");
        number_2 = Integer.parseInt(scan.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Please input valid number_2 !");
      }
    }

    System.out.println("Before swapping values");
    System.out.println("Number_1 = " + number_1);
    System.out.println("Number_2 = " + number_2);

    number_1 = number_1 + number_2;
    number_2 = number_1 - number_2;
    number_1 = number_1 - number_2;

    System.out.println("After swapping values");
    System.out.println("Number_1 = " + number_1);
    System.out.println("Number_2 = " + number_2);

  }
}
