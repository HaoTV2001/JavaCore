package home_work_part_2;

import java.util.Scanner;
/**
  Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
  Cách 1: Dùng if else-if.
  Cách 2: Dùng switch case.
*/
public class Exercise2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number;

    while (true) {
      try {
        System.out.print("Input number: ");
        number = Integer.parseInt(scan.nextLine());
        if (number < 1 || number > 10) {
          System.out.println("Please input number between 1 and 10!");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Please input valid number!");
      }
    }

    System.out.print("Number in English with (if - (else if)): ");
    if (number == 1) {
      System.out.println("One");
    } else if (number == 2) {
      System.out.println("Two");
    } else if (number == 3) {
      System.out.println("Three");
    } else if (number == 4) {
      System.out.println("Four");
    } else if (number == 5) {
      System.out.println("Five");
    } else if (number == 6) {
      System.out.println("Six");
    } else if (number == 7) {
      System.out.println("Seven");
    } else if (number == 8) {
      System.out.println("Eight");
    } else if (number == 9) {
      System.out.println("Nine");
    } else {
      System.out.println("Ten");
    }

    System.out.print("Number in English (switch case): ");
    switch (number) {
      case 1: System.out.println("One"); break;
      case 2: System.out.println("Two"); break;
      case 3: System.out.println("Three"); break;
      case 4: System.out.println("Four"); break;
      case 5: System.out.println("Five"); break;
      case 6: System.out.println("Six"); break;
      case 7: System.out.println("Seven"); break;
      case 8: System.out.println("Eight"); break;
      case 9: System.out.println("Nine"); break;
      case 10: System.out.println("Ten"); break;
      default: System.out.println("Number out of range");
    }

  }
}
