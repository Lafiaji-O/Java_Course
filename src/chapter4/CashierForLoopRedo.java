package chapter4;

import java.util.Scanner;

public class CashierForLoopRedo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantity;
        double price, total = 0.00;

        System.out.println("Enter the amount of items you want to scan: ");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {

            System.out.println("Enter the price of the item: ");
            price = scanner.nextDouble();

            total = total + price;

        }

        scanner.close();

        System.out.println("The total price of items scanned is $" + total + ".");


    }

}