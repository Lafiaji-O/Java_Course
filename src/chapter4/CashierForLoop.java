package chapter4;

import java.util.Scanner;

public class CashierForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantity, i;
        double price, total = 0;

        System.out.print("Enter the number of items you want to scan: ");
        quantity = scanner.nextInt();

        for (i = 0; i < quantity; i++) {

            System.out.print("Enter the price of the item: ");
            price = scanner.nextDouble();

            total = total + price;

        }

        scanner.close();

        System.out.println("The total price for your items is $" + total + ".");

    }
}
