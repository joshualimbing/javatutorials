package com.javatutorial;

import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveArraysExercise {
    public static void main(String[] args) {
        int [] numbers = new int [3];
        int sum = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.printf("The sum of the numbers is: %d", sum);
    }
}
