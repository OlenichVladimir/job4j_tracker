package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3To3Then3() {
        int left = 3;
        int right = 3;
        int below = 3;
        int result = Max.max(left, below, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To5To6To7Then7() {
        int left = 4;
        int right = 5;
        int below = 6;
        int higher = 7;
        int result = Max.max(left, below, higher, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}