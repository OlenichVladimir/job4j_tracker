package ru.job4j.pojo;

public class Book {
    private int pages;
    private String name;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
