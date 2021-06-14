package com.javatutorial;

import java.util.Arrays;

public class InstanceVariable {
    public static void main(String[] args) {
        InstanceVariablePerson person1 = new InstanceVariablePerson();
        InstanceVariablePerson person2 = new InstanceVariablePerson();

        person1.setName("Joshua");
        person1.setAge(26);
        person1.setAddress("Dasma, Cavite");
        person1.setAddress("Dasma, Cavite");
        person1.setGender("Male");

        person1.sayHello();

        person1.setName("Josh Pogi");
        person1.setAge(18);
        person1.setAddress("Cebu");

        person2.setName("Charles");
        person2.setAge(21);
        person2.setAddress("Marawi");
        person2.setGender("LGTV");

        person1.sayHello();
        person2.sayHello();

    }
}
