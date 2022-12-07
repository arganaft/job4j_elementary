package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when52to18then7dot21() {
        double expected = 7.21;
        int x1 = 5;
        int y1 = 2;
        int x2 = 1;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when543and864to639and742then155dot24174() {
        double expected = 155.24174;
        int x1 = 543;
        int y1 = 864;
        int x2 = 639;
        int y2 = 742;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.00001);
    }

    @Test
    public void when100and200to300and400then282dot8() {
        double expected = 282.8;
        int x1 = 100;
        int y1 = 200;
        int x2 = 300;
        int y2 = 400;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}