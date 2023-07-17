package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when12to34then2dot82() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double expected = 2.82;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when13to24then1dot41() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 4);
        double expected = 1.41;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when567to8910then5dot19() {
        Point a = new Point(5, 6, 7);
        Point b = new Point(8, 9, 10);
        double expected = 5.19;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }
}