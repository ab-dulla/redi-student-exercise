package com.redi;

public class Main {

    public static void main(String[] args) {
        // Defining students
        Student bob = new Student("Bob", 36, false, "Berlin");
        Student alice = new Student("Alice", 25, true, "Moscow");
        Student john = new Student("John", 19, true, "San Fransisco");
        Student jane = new Student("Jane", 46, false, "Rio");

        // Adding friends
        bob.addFriend(alice);
        bob.addFriend(jane);
        alice.addFriend(bob);
        alice.addFriend(jane);
        john.addFriend(jane);
        jane.addFriend(john);
        jane.addFriend(alice);
        jane.addFriend(bob);

        // Introducing each of them
        bob.introduce();
        alice.introduce();
        john.introduce();
        jane.introduce();
    }
}
