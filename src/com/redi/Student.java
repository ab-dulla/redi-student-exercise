package com.redi;

import java.util.ArrayList;

class Student {
    String name;
    int age;
    boolean single;
    String city;
    ArrayList<String> friends = new ArrayList<>();

    public Student(String name, int age, boolean single, String city) {
        this.name = name;
        this.age = age;
        this.single = single;
        this.city = city;
    }

    void addFriend(Student friend) {
        friends.add(friend.name);
    }

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old");
        if (single) {
            System.out.println("I'm single");
        } else {
            System.out.println("I'm in a relationship ^_^ ");
        }
        System.out.println("My friends are:");
        friends.forEach(System.out::println);
        System.out.println("---------------");
    }
}
