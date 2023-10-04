package ru.job4j.collection;

import java.util.*;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> uniqueNumber = new HashSet<>();
        for (Task task : tasks) {
            uniqueNumber.add((task.getNumber()));
        }
        return uniqueNumber;
    }
}
