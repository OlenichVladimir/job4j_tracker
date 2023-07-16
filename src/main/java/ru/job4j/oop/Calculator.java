package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + multiply(s) + divide(s);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(1));
        System.out.println(minus(2));
        System.out.println(calculator.multiply(3));
        System.out.println(calculator.divide(4));
        System.out.println(calculator.sumAllOperation(5));
    }
}