package ru.job4j.oop;

public class BirdMain {

    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public void fly() {
                System.out.println("Попугай летает только внутри анонимного класса");
            }
        };
        bird.fly();
    }
}