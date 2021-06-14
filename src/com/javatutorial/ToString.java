package com.javatutorial;

public class ToString {
    public static void main(String[] args) {
        ToStringPerson person1 = new ToStringPerson("Joshua", 160.9);
        ToStringPerson person2 = new ToStringPerson("Charles", 170.77);
        ToStringPerson person3 = new ToStringPerson();


        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
