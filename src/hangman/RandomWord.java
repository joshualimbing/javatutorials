package hangman;

import java.util.Arrays;
import java.util.Random;

public class RandomWord {
    private String[] words = {"father", "family", "statue", "radiant", "intimidating", "blacksmith", "sheriff", "binding", "nature", "glimmer", "flame", "rupture"};

    private String chosenWord;
    private char[] characters;

    Random random = new Random();

    public RandomWord() {
        chosenWord = words[random.nextInt(words.length)];
        characters = new char[chosenWord.length()];
    }

    public String toString() {
        StringBuilder text = new StringBuilder();

        for (char c : characters){

            text = (c == '\u0000') ? text.append('_') : text.append(c);

            text.append(' ');
        }

        return text.toString();
    }

    public boolean addGuess(char c){
        boolean correct = false;

        for (int i = 0; i < chosenWord.length(); i++){
            if (c == chosenWord.charAt(i)){
                characters[i] = c;
                correct = true;
            }
        }

        return correct;
    }

    public boolean isComplete(){

        boolean isComplete = true;

        for (char c: characters){
            if (c == '\u0000'){
                isComplete = false;
            }
        }

        return isComplete;
    }
}
