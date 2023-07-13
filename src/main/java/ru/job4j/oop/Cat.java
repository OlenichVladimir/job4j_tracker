package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("Как завут нашего котика и какую еду предпочитает котенок?");
        Cat gav = new Cat();
        gav.eat("У котика по имени Гав любимая еда это котлеты");
        gav.giveNick("У нашего котика имя Гав");
        gav.show();
        System.out.println("Как завут нашего второго кота и какую еду он предпочитает");
        Cat black = new Cat();
        black.eat("У нашего кота по имени Черныш любимая еда это рыба");
        black.giveNick("У нашего второго кота имя Черныш");
        black.show();
    }
}