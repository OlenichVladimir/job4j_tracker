package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else if (position > 1) {
            System.out.println("Песня не найдена");
        } else if (position < 2) {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox position = new Jukebox();
        position.music(1);
        position.music(2);
        position.music(3);
    }
}