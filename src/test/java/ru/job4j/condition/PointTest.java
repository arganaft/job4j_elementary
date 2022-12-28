package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when52to18then7dot21() {
        double expected = 7.21;
        Point a = new Point(5, 2);
        Point b = new Point(1, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when543and864to639and742then155dot24174() {
        double expected = 155.24;
        Point a = new Point(543, 864);
        Point b = new Point(639, 742);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100and200to300and400then282dot8() {
        double expected = 282.8;
        Point a = new Point(100, 200);
        Point b = new Point(300, 400);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }
}