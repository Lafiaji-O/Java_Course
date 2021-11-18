package chapter4;

import java.util.Scanner;

public class LetterSearchRedo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      String word;
      boolean letterFound = false;
      char currentLetter;

        System.out.println("Enter a word of your choice:");
        word = scanner.next();

        scanner.close();

        for (int i = 0; i < word.length(); i++) {

            currentLetter = word.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a') {

                letterFound = true;
                break;

            }
        }

        if (letterFound) {

            System.out.println("There is an a, in the word you entered.");

        } else {

            System.out.println("There is no a, in the word you entered.");

        }
    }
}
