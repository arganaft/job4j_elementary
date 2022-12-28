package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax456To85Then456() {
        int left = 456;
        int right = 342;
        int result = Max.max(left, right);
        int expected = 456;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To7Then7() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7And12And3Then12() {
        int left = 7;
        int right = 12;
        int first = 3;
        int result = Max.max(left, right, first);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7And12And3And15Then15() {
        int left = 7;
        int right = 12;
        int first = 3;
        int second = 15;
        int result = Max.max(left, right, first, second);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}