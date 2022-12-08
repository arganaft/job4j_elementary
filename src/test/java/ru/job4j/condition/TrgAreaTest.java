package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class TrgAreaTest {

    @Test
    void area() {
        double result = TrgArea.area(2, 2, 2);
        double expected = 1.73;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }
}