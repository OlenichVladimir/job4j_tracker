package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int below, int right) {
        return max(left, max(below, right));
    }

    public static int max(int left, int below, int higher, int right) {
        return max(left, max(below, higher, right));
    }

    public static void main(String[] args) {
        int max = max(1, 2, 3, 4);
        System.out.println(max);
    }
}
