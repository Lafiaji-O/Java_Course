package chapter4;

import java.util.Scanner;

public class LetterSearchRedo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text;
        boolean letterFound = false;

        System.out.print("Enter a word of your choice: ");
        text = scanner.next();

        scanner.close();

         for (int i = 0; !letterFound && i < text.length(); i++) {

            char currentLetter = text.charAt(i);

             if (currentLetter == 'A' || currentLetter == 'a') {

                 letterFound = true;
             }

         }

         if (letterFound) {

             System.out.println("The word contains letter a");

         } else {

             System.out.println("The word does not contain letter a");

         }

    }
}
