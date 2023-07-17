package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String english = "Неизвестное слово. ";
        return english + eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String voice = word.engToRus("some word");
        System.out.println(voice);
    }
}
