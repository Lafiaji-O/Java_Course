package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double rate = 10.50, maxHours = 40.00, hoursWorked, grossPay;

        System.out.print("How many hours did you work this week?: ");
        hoursWorked = scanner.nextDouble();


        while (hoursWorked > maxHours || hoursWorked < 1) {

            System.out.println("Invalid input. Your hours must be between 1 and 40. Please enter a valid hour.");
            hoursWorked = scanner.nextDouble();

        }

        scanner.close();

        grossPay = rate * hoursWorked;
        System.out.println("Gross pay for this week is $" + grossPay + ".");

    }
}
