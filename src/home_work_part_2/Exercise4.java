package home_work_part_2;

import java.util.Scanner;
/**
  Nhập vào 2 số nguyên a, b. In ra màn hình kết quả số lớn nhất, nhỏ nhất.
*/
public class Exercise4 {

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

    System.out.println("Max is: "+Math.max(number_1,number_2));
    System.out.println("Min is: "+Math.min(number_1,number_2));
  }
}
