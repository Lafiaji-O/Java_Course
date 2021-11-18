package chapter5;

import java.util.Scanner;

public class LoanQualify {

    static  Scanner scanner = new Scanner(System.in);
    static double expectedYears = 5, yearsWorked, expectedIncome = 50000, income;

    public static void main(String[] args) {

        getYearsWorked ();
        getIncome ();

        scanner.close();

        doesApplicantQualify (yearsWorked, income);
        notifyApplicant ();
        
    }

    public static double getYearsWorked () {

        System.out.println("How many years have you worked for?: ");
        yearsWorked = scanner.nextDouble();

        return yearsWorked;

    }

    public static double getIncome () {

        System.out.println("What is your annual income?: ");
        income = scanner.nextDouble();

        return income;

    }

    public static boolean doesApplicantQualify (double yearsWorked, double income) {

        if (yearsWorked >= expectedYears && income >= expectedIncome) {

            return true;

        } else {

            return false;

        }

    }

    public static void notifyApplicant () {

        if (doesApplicantQualify(yearsWorked, income)) {

            System.out.println("You are eligible.");

        } else {

            System.out.println("You are not eligible.");

        }
    }
}
