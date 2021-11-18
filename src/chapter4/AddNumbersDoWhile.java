package chapter4;

import java.util.Scanner;

public class AddNumbersDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again = false;
        int number1, number2;

        do {

            System.out.print("Enter your first number: ");
            number1 = scanner.nextInt();

            System.out.print("Enter your second number: ");
            number2 = scanner.nextInt();

            int sum = number1 + number2;

            System.out.println("The sum is " + sum + ".");

            System.out.println("Will you like to try that again? Please enter true or false below.");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();
    }
}
