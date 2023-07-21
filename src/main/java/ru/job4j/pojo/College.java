package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Vladimir Olenich");
        student.setGroup("job4j");
        student.setReceipt(new Date());
        System.out.println(student.getFullname() + "in a group " + student.getGroup() + " " + student.getReceipt());
    }
}
