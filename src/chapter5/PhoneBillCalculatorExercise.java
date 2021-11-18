package chapter5;

import java.util.Scanner;

public class PhoneBillCalculatorExercise {

    static Scanner scanner = new Scanner(System.in);

   static double planFee, extraMinutes, extraMinutesRate = 0.25, overChargeFee, tax, subTotalTax = 0.15, subTotal, finalTotal;

    public static void main(String[] args) {

        System.out.println("What is your monthly phone fee?: ");
        planFee = scanner.nextDouble();

        System.out.println("How many extra minutes did you use, this month?: ");
        extraMinutes = scanner.nextDouble();

        scanner.close();

        getOverChargeFee();
        getSubTotal();
        getTax();
        getFinalTotal();
        displayBill(planFee, overChargeFee, tax, finalTotal);

    }

    public static double getOverChargeFee() {

        overChargeFee = extraMinutes * extraMinutesRate;

        return overChargeFee;

    }

    public static double getSubTotal() {

        subTotal = planFee + overChargeFee;

        return subTotal;

    }

    public static double getTax() {

        tax = subTotal * subTotalTax;

        return tax;

    }

    public static double getFinalTotal() {

        finalTotal = tax + planFee + overChargeFee;

        return finalTotal;

    }

    public static void displayBill (double planFee, double overChargeFee, double tax, double finalTotal) {

        System.out.println("Itemized bill below: ");
        System.out.println("Plan fee is $" + String.format("%.2f", planFee));
        System.out.println("Extra minutes charge is $" + String.format("%.2f", overChargeFee));
        System.out.println("Tax is $" + String.format("%.2f", tax));
        System.out.println("Total fee is $" + String.format("%.2f", finalTotal));

    }
}
