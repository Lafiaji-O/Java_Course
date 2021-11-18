package chapter4;

import java.util.Scanner;

public class AverageTestScoreNestedLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 3, numberOfTests = 4;
        double score, total, average;

        for (int i = 0; i < numberOfStudents; i++) {

            total= 0;

            for (int j = 0; j < numberOfTests; j++) {

                System.out.println("Enter the score for test #" + (j + 1));
                score = scanner.nextDouble();

                total = total + score;

            }

            average = total / numberOfTests;

            System.out.println("The average score for student " + (i + 1) + ", is " + average + ".");

        }

    }
}
