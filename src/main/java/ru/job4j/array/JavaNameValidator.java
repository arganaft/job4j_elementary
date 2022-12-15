package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.length() < 1) {
            return  false;
        }
        for (int i = 0; i < name.toCharArray().length; i++) {
            int charCod = name.toCharArray()[i];
            if (i == 0 && !isLowerLatinLetter(charCod)) {
                return false;
            }
            if (!isCharValid(charCod)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCharValid(int i) {
        return (isSpecialSymbol(i) || isUpperLatinLetter(i) || isLowerLatinLetter(i) || Character.isDigit(i));
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        for (int i = 65; i <= 90; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        for (int i = 97; i <= 122; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }
}