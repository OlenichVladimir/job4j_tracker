package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moving on rails.");
    }

    @Override
    public void passengers() {
        System.out.println(getClass().getSimpleName() + " capable of carrying up to 150 passengers.");
    }
}
