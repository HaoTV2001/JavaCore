package home_work_part_1;

import java.util.Scanner;

public class Exercise4 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double mathScores, physicsScores, chemistryScores, mediumScore;
    int mathCoefficient, physicsCoefficient, chemistryCoefficient;

    while (true) {
      try {
        System.out.print("Input mathScores: ");
        mathScores = Double.parseDouble(scan.nextLine());
        if (mathScores < 0 || mathScores > 10) {
          System.out.println("Please input: 0 <= mathScores <= 10");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (true) {
      try {
        System.out.print("Input mathCoefficient: ");
        mathCoefficient = Integer.parseInt(scan.nextLine());
        if (mathCoefficient < 1 || mathCoefficient > 2) {
          System.out.println("Please input: 1 <= mathCoefficient <= 2");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (true) {
      try {
        System.out.print("Input physicsScores: ");
        physicsScores = Double.parseDouble(scan.nextLine());
        if (physicsScores < 0 || physicsScores > 10) {
          System.out.println("Please input: 0 <= physicsScores <= 10");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (true) {
      try {
        System.out.print("Input physicsCoefficient: ");
        physicsCoefficient = Integer.parseInt(scan.nextLine());
        if (physicsCoefficient < 1 || physicsCoefficient > 2) {
          System.out.println("Please input: 1 <= physicsCoefficient <= 2");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (true) {
      try {
        System.out.print("Input chemistryScores: ");
        chemistryScores = Double.parseDouble(scan.nextLine());
        if (chemistryScores < 0 || chemistryScores > 10) {
          System.out.println("Please input: 0 <= chemistryScores <= 10");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    while (true) {
      try {
        System.out.print("Input chemistryCoefficient: ");
        chemistryCoefficient = Integer.parseInt(scan.nextLine());
        if (chemistryCoefficient < 1 || chemistryCoefficient > 2) {
          System.out.println("Please input: 1 <= chemistryCoefficient <= 2");
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number");
      }
    }

    mediumScore = (mathScores * mathCoefficient + physicsScores * physicsCoefficient +
        chemistryScores * chemistryCoefficient) / (mathCoefficient + physicsCoefficient
        + chemistryCoefficient);

    System.out.println("=== Results ===");
    System.out.printf("Medium Score: %.2f", mediumScore);
  }
}
