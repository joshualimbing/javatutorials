package com.javatutorial;

public class InstanceVariablePerson {
    private String name;
    private int age;
    private String address;
    private String gender;

    void sayHello(){
        System.out.print("Hola! I am " + getName());
        System.out.println(". I am " + getAge() + " years old " + getGender() + ".");
        System.out.println("I'm from " + getAddress());
    }

    void setName(String theName){
        this.name = theName;
    }

    void setAge(int theAge){
        this.age = theAge;
    }

    void setAddress(String theAddress){
        this.address = theAddress;
    }

    void setGender(String theGender){
        this.gender = theGender;
    }

    private String getName(){
        return name;
    }

    private int getAge(){
        return age;
    }

    private String getAddress(){
        return address;
    }

    private String getGender(){
        return gender;
    }
}
