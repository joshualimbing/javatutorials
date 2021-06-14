package com.javatutorial;

class Person{
    String name;
}

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person ();
        person1.name = "Joshua";

        Person person2 = new Person ();
        person2.name = "Charles";

        System.out.println(person1.name);
        System.out.println(person2.name);

    }
}
