package com.javatutorial;

import java.util.Scanner;

public class MethodParameters {

    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int number = input.nextInt();

        System.out.print("Enter another value: ");
        int number2 = input.nextInt();

        System.out.println(number + " squared is: " + calculate.square(number));
        System.out.println(number2 + " squared is: " + calculate.square(number2));
        System.out.println();

        System.out.println("The sum of " + number + " and " + number2 + " is: " + calculate.add(number, number2));

    }


}
