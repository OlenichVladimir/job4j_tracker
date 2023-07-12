package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String english = "Unknown word";
        return english;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String voice = word.engToRus();
        System.out.println("Неизвестное слово. " + voice);
    }
}
