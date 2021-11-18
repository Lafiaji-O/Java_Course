package chapter3;

import java.util.Scanner;

public class LoanQualifierPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int expectedSalary = 30000, expectedYears = 2;
        double salary, years;

        System.out.println("What is your current annual salary?");
        salary = scanner.nextDouble();

        System.out.println("How many years have you worked for?");
        years = scanner.nextDouble();

        scanner.close();


            if (salary >= expectedSalary) {

                if (years >= expectedYears) {

                    System.out.println("Congratulations, you qualify for the loan.");

                } else {

                    System.out.println("Sorry, you must have worked at your current job for " +
                            expectedYears + " years.");

                }

            } else {

                System.out.println("Sorry, you must earn at least $" + expectedSalary + " annually, to qualify.");

            }


    }
}
