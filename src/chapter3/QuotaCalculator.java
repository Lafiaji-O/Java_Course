package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quota = 10, sales, salesShort;

        System.out.println("How many sales did you make this week?");
        sales = scanner.nextInt();

        scanner.close();

        if (sales >= quota) {

            System.out.println("Congrats! You have met your quota for the week.");

        } else {

            salesShort = quota - sales;
            System.out.println("Unfortunately, you did not make the quota for the week. " +
                    "You were " + salesShort + " sales short.");

        }
    }
}
