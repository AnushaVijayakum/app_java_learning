package com.learning.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final byte PERCENT = 100;
    final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        int period = scanner.nextInt();
        int totalMonths = period * MONTHS_IN_YEAR;

        double mortgage = principal
                * ( monthlyInterest * Math.pow( 1+ monthlyInterest, totalMonths))
                / (Math.pow(1 + monthlyInterest, totalMonths) - 1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + formattedMortgage);
    }
}
