package com.touristconverter.app;

import com.touristconverter.input.UserInput;
import com.touristconverter.converter.CurrencyConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Global Currency Converter =====");
        System.out.println("Module 1: User Input");
        System.out.println("Module 2: Fiat Currency Converter");

        UserInput userInput = new UserInput();
        CurrencyConverter converter = new CurrencyConverter();

        double amount = userInput.getAmount();
        String fromCurrency = userInput.getFromCurrency();
        String toCurrency = userInput.getToCurrency();

        double convertedAmount = converter.convertCurrency(
                amount, fromCurrency, toCurrency
        );

        System.out.println("\n----- Conversion Result -----");
        if (convertedAmount == -1) {
            System.out.println("Invalid currency selection.");
        } else {
            System.out.println(amount + " " + fromCurrency.toUpperCase()
                    + " = " + convertedAmount + " " + toCurrency.toUpperCase());
        }
    }
}