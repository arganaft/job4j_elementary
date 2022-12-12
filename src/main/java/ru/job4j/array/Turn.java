package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int lastElement = 1;
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - lastElement];
            array[array.length - lastElement] = temp;
            lastElement++;
        }
        return array;
    }
}