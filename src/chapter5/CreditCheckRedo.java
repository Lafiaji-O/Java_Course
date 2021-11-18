package chapter5;

import java.util.Scanner;

public class CreditCheckRedo {

    static Scanner scanner = new Scanner(System.in);

    static int expectedCreditScore = 800, creditScore;
    static double expectedSalary = 40000, salary;

    public static void main(String[] args) {

        getCreditScore();
        getSalary();

        scanner.close();

        isUserQualified(creditScore, salary);
        notifyUser();

    }

    public static int getCreditScore () {

        System.out.println("Enter your score:");
        creditScore = scanner.nextInt();

        return creditScore;

    }

    public static double getSalary () {

        System.out.println("Enter your salary: ");
        salary = scanner.nextDouble();

        return salary;

    }

    public static boolean isUserQualified(int creditScore, double salary) {

        if (creditScore >= expectedCreditScore && salary >= expectedSalary) {

            return true;

        } else {

            return false;

        }

    }

    public static void notifyUser () {

        if (isUserQualified(creditScore, salary)) {

            System.out.println("Congratulations");

        } else {

            System.out.println("Sorry");

        }

    }

}
