package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours the employee worked: ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter the employee's pay rate: ");
        double payRate = scanner.nextDouble();

        scanner.close();

        double grossPay = hoursWorked * payRate;

        System.out.println("The employee's pay is $" + grossPay + ".");

    }
}
