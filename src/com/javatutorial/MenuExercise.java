package com.javatutorial;

import java.util.Scanner;

public class MenuExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MenuMethod menu = new MenuMethod();

        System.out.println(menu.display());
    }
}
