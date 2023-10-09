package ru.job4j.collection;

import java.util.*;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> mail = new HashMap<>();
        mail.put("ivanov@gmail.com", "Ivanov I.I.");
        mail.put("petrov@gmail.com", "Petrov P.P.");
        mail.put("sidorov@gmail.com", "Sidorov S.S.");
        mail.put("petrov@gmail.com", "Petrov S.S.");
        for (String key : mail.keySet()) {
            String value = mail.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
