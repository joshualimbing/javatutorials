package hangman;

import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        var game = new HangmanMethods();
        var word = new RandomWord();

        game.run();
    }
}
