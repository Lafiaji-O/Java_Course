package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sales,expectedSales = 10, bonus = 250,pay = 1000;

        System.out.print("How many sales did you make this week?: ");
        sales = scanner.nextInt();

        scanner.close();

        if (sales > expectedSales) {

            pay = pay + bonus;

        }

        System.out.println("Your pay for this week is $" + pay + ".");

    }
}
