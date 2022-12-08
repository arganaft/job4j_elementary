package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP43dot67K21dot33Square20dot39() {
        double expected = 20.39;
        double p = 43.67;
        double k = 21.33;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP45K34Square14dot05() {
        double expected = 14.05;
        double p = 45;
        double k = 34;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2dot5K3dot3Square0dot27() {
        double expected = 0.27;
        double p = 2.5;
        double k = 3.3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}