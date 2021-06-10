package com.javatutorial;

import java.util.stream.IntStream;

public class StreamLoops {

    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "sloth", "tiger"};

        IntStream.range(1, 4).forEach(i -> {
            System.out.println(animals[i]);
        });
    }

}
