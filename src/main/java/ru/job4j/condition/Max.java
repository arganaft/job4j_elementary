package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int first) {
        return max(first, max(left, right));
    }

    public static int max(int left, int right, int first, int second) {
        return max(second, max(left, right, first));
    }
}