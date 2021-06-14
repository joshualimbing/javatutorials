package com.javatutorial;

public class ToStringPerson {

    private String name;
    private double height;

    public ToStringPerson(String name, double height){
        this.name = name;
        this.height = height;
    }

    public ToStringPerson(){
        this.name = "?";
        this.height = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "Name: " + name + ", height: " + height;
    }
}
