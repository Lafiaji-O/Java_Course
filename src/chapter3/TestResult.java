package chapter3;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score;
        char grade;

        System.out.print("Enter your score: ");
        score = scanner.nextInt();

        if (score >= 70) {

            grade = 'A';

        } else if (score >= 60) {

            grade = 'B';

        } else if (score >= 50) {

            grade = 'C';

        } else if (score >= 45) {

            grade = 'D';

        } else if (score >= 40) {

            grade = 'E';

        } else {

            grade = 'F';

        }

        System.out.println("Your grade is " + grade + ".");

    }
}
