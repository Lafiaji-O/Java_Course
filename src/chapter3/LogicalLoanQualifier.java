package chapter3;

import java.util.Scanner;

public class LogicalLoanQualifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salary = 30000, salaryExpected, years = 2, yearsWorked;

        System.out.print("Enter your annual salary: ");
        salaryExpected = scanner.nextDouble();

        System.out.print("How many years have you worked for?: ");
        yearsWorked = scanner.nextDouble();

        scanner.close();

        if (salaryExpected >= salary && yearsWorked >= years) {

            System.out.println("Congratulations!! You qualify for the loan.");

        } else {

            System.out.println("Sorry, you do not qualify for the loan.");

        }
    }
}
