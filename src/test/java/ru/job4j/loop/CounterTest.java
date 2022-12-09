package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    void whenSumFrom5To34Then585() {
        int start = 5;
        int finish = 34;
        int result = Counter.sum(start, finish);
        int expected = 585;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromMinus4ToTenThenThirty() {
        int start = -4;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromMinus21ToMinusTenThenThirty() {
        int start = -21;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = -90;
        assertThat(result).isEqualTo(expected);
    }
}