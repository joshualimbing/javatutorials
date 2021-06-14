package com.javatutorial;

import java.util.Arrays;

public class StreamForEachLoops {
    public static void main(String[] args) {
        String [] animals = {"dog", "cat", "bear"};

        Arrays.stream(animals).forEach(animal -> {
            System.out.println(animal);
        });
    }
}
