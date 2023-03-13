package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = name.length() >= 1 && isLowerLatinLetter(name.toCharArray()[0]);
        if (valid) {
            for (int i = 1; i < name.toCharArray().length; i++) {
                char symbol = name.toCharArray()[i];
                if (!(isSpecialSymbol(symbol) || isUpperLatinLetter(symbol) || isLowerLatinLetter(symbol) || Character.isDigit(symbol))) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(char symbol) {
        return ((int) symbol == 36 || (int) symbol == 95);
    }

    public static boolean isUpperLatinLetter(char symbol) {
        for (int i = 65; i <= 90; i++) {
            if ((int) symbol == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLowerLatinLetter(char symbol) {
        boolean result = false;
        for (int i = 97; i <= 122; i++) {
            if ((int) symbol == i) {
                result = true;
                break;
            }
        }
        return result;
    }
}