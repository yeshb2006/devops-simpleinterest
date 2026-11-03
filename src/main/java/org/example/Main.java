package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (% per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("-----------------------------------");
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Total Amount Payable = " + totalAmount);
        System.out.println("-----------------------------------");

        scanner.close();
    }
}