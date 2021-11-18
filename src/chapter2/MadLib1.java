package chapter2;

import java.util.Scanner;

public class MadLib1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season, adjective;
        int wholeNumber;

        System.out.print("Enter a season of the year: ");
        season = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        adjective = scanner.nextLine();

        System.out.print("Enter a whole number: ");
        wholeNumber = scanner.nextInt();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of "
                + wholeNumber + " cups of coffee.");

    }
}
