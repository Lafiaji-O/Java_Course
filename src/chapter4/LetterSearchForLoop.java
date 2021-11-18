package chapter4;

import java.util.Scanner;

public class LetterSearchForLoop {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        String text;
        boolean letterFound = false;
        char currentLetter;
        int i;

        System.out.println("Enter a word or sentence of your choice, below.");
        text = scanner.nextLine();

        scanner.close();

        for (i = 0; i < text.length(); i++) {

            currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {

                letterFound = true;
                break;

            }

        }

        if (letterFound) {

            System.out.println("Your text contains the letter A.");

        } else {

            System.out.println("Your text does not contain the letter A.");

        }

    }
}
