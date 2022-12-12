package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            } else if (i == pref.length - 1) {
                break;
            }
        }
        return result;
    }
}