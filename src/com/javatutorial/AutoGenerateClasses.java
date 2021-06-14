package com.javatutorial;

public class AutoGenerateClasses {
    public static void main(String[] args) {
        AutoGenerateClassesMountain mountain1 = new AutoGenerateClassesMountain(9_692, 150, "Mt. Apo");
        AutoGenerateClassesMountain mountain2 = new AutoGenerateClassesMountain();

        var mountain3 = new AutoGenerateClassesMountain(5_895, 350, "Mt. Kilimanjaro");

        System.out.println(mountain1.toString());
        System.out.println(mountain2.toString());
        System.out.println(mountain3.toString());
    }
}
