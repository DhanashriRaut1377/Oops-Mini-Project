package com.touristconverter;

import java.text.DecimalFormat;

public class UtilityModule {
    
    // Constants
    public static final String DEFAULT_CURRENCY = "USD";
    public static final int DECIMAL_PLACES = 2;
    
    // Format number with decimal places
    public static String formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(number);
    }
    
    // Format currency with symbol
    public static String formatCurrency(double amount, String currencyCode) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(amount) + " " + currencyCode;
    }
    
    // Validate if input is a valid number
    public static boolean isValidNumber(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    // Validate if amount is positive
    public static boolean isPositiveNumber(String input) {
        if (!isValidNumber(input)) {
            return false;
        }
        double value = Double.parseDouble(input);
        return value > 0;
    }
    
    // Trim and clean input
    public static String cleanInput(String input) {
        if (input == null) {
            return "";
        }
        return input.trim().toUpperCase();
    }
    
    // Check if currency code is valid (3 letters)
    public static boolean isValidCurrencyCode(String code) {
        if (code == null || code.length() != 3) {
            return false;
        }
        return code.matches("[A-Z]{3}");
    }
}