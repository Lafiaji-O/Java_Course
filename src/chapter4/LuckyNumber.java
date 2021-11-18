package chapter4;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int luckyNumber = 14, guess;

        System.out.println("You'll keep playing until you get the lucky number." +
                "\nEnter your guess: ");
        guess = scanner.nextInt();

        while (guess < luckyNumber || guess > luckyNumber) {

            System.out.println("Ooppss!! That is not it. Try again. ");
            guess = scanner.nextInt();

        }

        scanner.close();

        System.out.println("Yaaay!!! You got it!");

    }
}
