package chapter5;

import java.util.Scanner;

public class MethodTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("What is your name? : ");
        name =scanner.next();

        scanner.close();

        greetUser(name);


    }

    public static void greetUser (String name) {

        System.out.println("Hello " + name + ", how are you?");

    }
}
