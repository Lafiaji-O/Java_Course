package chapter5;

import java.util.Scanner;

public class CreditCheckRedo1 {

    static Scanner scanner = new Scanner(System.in);

    static int creditScore = 800, myCreditScore;
    static double salary = 50000, mySalary;

    public static void main(String[] args) {

        getMyCreditScore();
        getMySalary();

        scanner.close();

        amIQualified(myCreditScore, mySalary);
        notifyMe();

    }

    public static int getMyCreditScore() {

        System.out.println("What is your credit score?: ");
        myCreditScore = scanner.nextInt();

        return myCreditScore;

    }

    public static double getMySalary () {

        System.out.println("What is your annual income?: ");
        mySalary = scanner.nextDouble();

        return mySalary;

    }

    public static boolean amIQualified (int myCreditScore, double mySalary) {

        if (myCreditScore >= creditScore && mySalary >= salary) {

            return true;

        } else {

            return false;

        }

    }

    public static void notifyMe () {

        if (amIQualified(myCreditScore, mySalary)) {

            System.out.println("You qualify.");

        } else {

            System.out.println("You don't qualify");

        }
    }
}
