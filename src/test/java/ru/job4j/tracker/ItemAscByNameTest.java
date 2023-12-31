package ru.job4j.tracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class ItemAscByNameTest {

    @Test
    void sortAscByName() {
        Item item1 = new Item("Anton");
        Item item2 = new Item("Yakov");
        Item item3 = new Item("Gena");
        List<Item> items = Arrays.asList(item1, item2, item3);
        Collections.sort(items, new ItemAscByName());
        List<Item> exp = Arrays.asList(item1, item3, item2);
        Assertions.assertIterableEquals(exp, items);
    }
}