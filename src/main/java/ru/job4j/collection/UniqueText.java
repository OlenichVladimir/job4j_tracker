package ru.job4j.collection;

import java.util.*;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, origin);
        for (String duplicate : text) {
            if (!check.contains(duplicate)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}