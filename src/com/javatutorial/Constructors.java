package com.javatutorial;

public class Constructors {
    public static void main(String[] args) {
        ConstructorPersons person1 = new ConstructorPersons("Joshua", 160.9);
        ConstructorPersons person2 = new ConstructorPersons("Charles", 170.77);
        ConstructorPersons person3 = new ConstructorPersons();


        System.out.println(person1.getName());
        System.out.println(person1.getHeight());

        System.out.println(person2.getName());
        System.out.println(person2.getHeight());

        System.out.println(person3.getName());
        System.out.println(person3.getHeight());
    }
}
