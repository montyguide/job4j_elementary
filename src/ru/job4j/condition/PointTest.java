package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int in1 = -2;
        int in2 = 4;
        int in3 = 8;
        int in4 = 3;
        double expected = 10.04;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
