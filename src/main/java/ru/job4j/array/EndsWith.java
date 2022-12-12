package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i =  0; i < word.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            } else if (i == post.length - 1) {
                break;
            }
        }
        return result;
    }
}