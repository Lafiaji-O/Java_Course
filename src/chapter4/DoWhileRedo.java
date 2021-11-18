package chapter4;

import java.util.Scanner;

public class DoWhileRedo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        boolean again = true;

        do {

            System.out.print("Enter a number: ");
            a = scanner.nextInt();

            System.out.println("Enter the number, you want to multiply it by: ");
            b = scanner.nextInt();

            c = a * b;

            System.out.println("The answer is " + c + ".");

            System.out.println("Dp you wish to try again?\n" +
                    "if yes, type true, else type false.");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();

    }
}
