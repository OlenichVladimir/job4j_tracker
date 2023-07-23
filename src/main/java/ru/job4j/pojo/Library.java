package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        System.out.println("Books available in the library:");
        Book kids = new Book("Kids", 10);
        Book hunt = new Book("Hunt", 30);
        Book fishing = new Book("Fishing", 25);
        Book cleanCode = new Book("Clean code", 15);
        Book[] books = new Book[4];
        books[0] = kids;
        books[1] = hunt;
        books[2] = fishing;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            System.out.println(bo.getName() + " number of pages in a book " + bo.getPages());
        }
        System.out.println("Swapping array elements");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            System.out.println(bo.getName() + " number of pages in a book " + bo.getPages());
        }
        System.out.println("Find book Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            if (bo.getName().equals("Clean code")) {
                System.out.println(bo.getName() + " number of pages in a book " + bo.getPages());
            }
        }
    }
}
