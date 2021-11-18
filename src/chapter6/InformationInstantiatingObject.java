package chapter6;

import java.util.Scanner;

public class InformationInstantiatingObject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InformationClassesAndObjects info = new InformationClassesAndObjects();

        System.out.println("Please enter your name below: ");
        String name = scanner.next();
        info.setName(name);

        System.out.println("Please enter your age below: ");
        int age = scanner.nextInt();
        info.setAge(age);

        System.out.println("Please enter your gender below: ");
        String gender = scanner.next();
        info.setGender(gender);

        System.out.println("Please enter your country of origin, below");
        String country = scanner.next();
        info.setCountry(country);


        System.out.println(info.getName() + " is a " + info.getAge() + " years old " + info.getGender() + ", from " + info.getCountry() + ".");

    }

}
