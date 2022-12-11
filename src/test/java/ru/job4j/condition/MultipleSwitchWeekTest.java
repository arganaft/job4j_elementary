package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    void whenTuesdayThen2() {
        int result = MultipleSwitchWeek.numberOfDay("Tuesday");
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAnotherDayThenMinus1() {
        int result = MultipleSwitchWeek.numberOfDay("AnotherDay");
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}