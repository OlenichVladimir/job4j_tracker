package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flies through the air.");
    }

    @Override
    public void passengers() {
        System.out.println(getClass().getSimpleName() + " capable of carrying up to 250 passengers.");
    }
}
