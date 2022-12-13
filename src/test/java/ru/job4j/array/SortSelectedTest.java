package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort11And37And5And322And0() {
        int[] data = new int[] {11, 37, 5, 322, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 5, 11, 37, 322};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5And9And5And7And3() {
        int[] data = new int[] {5, 9, 5, 7, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 5, 5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4And12() {
        int[] data = new int[] {4, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 12};
        assertThat(result).containsExactly(expected);
    }
}