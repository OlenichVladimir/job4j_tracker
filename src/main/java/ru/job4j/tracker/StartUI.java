package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StartUI extends Item {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEE, MMMM d, yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E, MMMM d, y, G, w, a, HH:mm:ss:SS", Locale.ENGLISH);
        System.out.println("Текущие дата и время после форматирования: " + item.getCreated().format(formatter));
        System.out.println("Текущие дата и время после форматирования: " + item.getCreated().format(formatter1));
        System.out.println("Текущие дата и время после форматирования: " + item.getCreated().format(formatter2));
    }
}
