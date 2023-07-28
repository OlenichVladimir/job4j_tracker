package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moving on fast roads.");
    }

    @Override
    public void passengers() {
        System.out.println(getClass().getSimpleName() + " capable of carrying up to 30 passengers.");
    }
}
