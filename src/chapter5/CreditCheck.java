package chapter5;

import java.util.Scanner;

public class CreditCheck {

   static Scanner scanner = new Scanner(System.in);
    static int requiredCreditScore = 700, creditScore;
    static double requiredSalary = 25000, salary;

    public static void main(String[] args) {

        int creditScore = getCreditScore();
        double salary = getSalary();

        scanner.close();

        boolean qualified = isUserQualified(creditScore, salary);

        notifyUser(qualified);

    }

    public static int getCreditScore () {

        System.out.println("Please enter your credit score below: ");
        creditScore = scanner.nextInt();

        return creditScore;

    }

    public static double getSalary () {

        System.out.println("Please enter your annual salary below: ");
        salary = scanner.nextDouble();

        return salary;

    }

    public static boolean isUserQualified (int creditScore, double salary) {

        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {

            return true;

        } else {

            return false;

        }

    }

    public static void notifyUser (boolean qualified) {

        if (qualified) {

            System.out.println("Congratulations, you are eligible for this loan.");

        } else {

            System.out.println("Sorry, you do not qualify for this loan.");

        }
    }
}
