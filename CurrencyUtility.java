package com.touristconverter.utility;

public class CurrencyUtility {

    public double getExchangeRate(String fromCurrency, String toCurrency) {

        fromCurrency = fromCurrency.toUpperCase();
        toCurrency = toCurrency.toUpperCase();

        if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            return 0.012;
        } 
        else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            return 83.00;
        } 
        else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            return 0.011;
        } 
        else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            return 90.00;
        } 
        else if (fromCurrency.equals(toCurrency)) {
            return 1.0;
        }

        return -1;
    }
}