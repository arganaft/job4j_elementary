package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        /*int distance = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                distance++;
            }
            if (array[index] != null && index > 0) {
                array[index - distance] = array[index];
                array[index] = null;
            }
        }
        return array;*/

        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
