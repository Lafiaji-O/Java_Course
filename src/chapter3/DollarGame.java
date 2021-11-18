package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pennies = 80.00, nickels = 35.00, dimes = 100.00, quarters = 55.00, amount = 1000.00, total, moreThan, lessThan;
        int penniesNeeded, nickelsNeeded, dimesNeeded, quartersNeeded;

        System.out.print("How many pennies do you want?: ");
        penniesNeeded = scanner.nextInt();

        System.out.print("How many nickels do you want?: ");
        nickelsNeeded = scanner.nextInt();

        System.out.print("How many dimes do you want?: ");
        dimesNeeded = scanner.nextInt();

        System.out.println("How many quarters do you want?: ");
        quartersNeeded = scanner.nextInt();

        scanner.close();

        total = (pennies * penniesNeeded) + (nickels * nickelsNeeded) + (dimes * dimesNeeded) + (quarters * quartersNeeded);

        if (total > amount) {

            moreThan = total - amount;
            System.out.println("Unfortunately, you were " + moreThan + ", more than " + amount + ".");

        } else if (total < amount) {

            lessThan = amount - total;
            System.out.println("Unfortunately, you were " + lessThan + ", less than " + amount + ".");

        } else {

            System.out.println("Congratulations!!! You won the game!!!");

        }

    }
}
