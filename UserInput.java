package com.touristconverter.input;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public double getAmount() {
        System.out.print("Enter amount: ");
        return scanner.nextDouble();
    }

    public String getFromCurrency() {
        System.out.print("Enter source currency (INR/USD/EUR): ");
        return scanner.next();
    }

    public String getToCurrency() {
        System.out.print("Enter target currency (INR/USD/EUR): ");
        return scanner.next();
    }
}