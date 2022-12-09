package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import javax.sql.rowset.spi.SyncResolver;

import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void when1ThenMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2ThenTuesday() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when7ThenSunday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when12ThenError() {
        int day = 12;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}