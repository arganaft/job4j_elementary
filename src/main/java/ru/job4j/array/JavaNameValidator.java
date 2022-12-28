package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = name.length() >= 1 && isLowerLatinLetter(name.toCharArray()[0]);
        if (valid) {
            for (int i = 0; i < name.toCharArray().length; i++) {
                if (!isCharValid(name.toCharArray()[i])) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isCharValid(char symbol) {
        return (isSpecialSymbol(symbol) || isUpperLatinLetter(symbol) || isLowerLatinLetter(symbol) || Character.isDigit(symbol));
    }

    public static boolean isSpecialSymbol(char symbol) {
        int code = symbol;
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(char symbol) {
        int code = symbol;
        for (int i = 65; i <= 90; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLowerLatinLetter(char symbol) {
        int code = symbol;
        boolean result = false;
        for (int i = 97; i <= 122; i++) {
            if (code == i) {
                result = true;
                break;
            }
        }
        return result;
    }
}