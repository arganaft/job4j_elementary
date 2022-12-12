package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap5to2() {
        int[] input = {54, 13, 83, 66, 3, 2, 9};
        int source = 5;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {54, 13, 2, 66, 3, 83, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {7, 13, 53, 6, 3, 2, 9};
        int source = 3;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 13, 6, 53, 3, 2, 9};
        assertThat(result).containsExactly(expected);
    }
}