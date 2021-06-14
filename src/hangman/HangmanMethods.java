package hangman;

import java.util.Scanner;

public class HangmanMethods {
    private boolean running = true;
    private RandomWord random = new RandomWord();
    private Scanner input = new Scanner(System.in);
    private int triesRemaining = 5;
    private char lastGuess;

    public void run(){
        do{
            displayWord();
            getUserInput();
            checkUserInput();
        }while(running);

    }

    public void displayWord(){
        System.out.println(random.toString());
    }

    private void getUserInput(){

        System.out.print("Enter your guess: ");
        String guess = input.next();


        lastGuess = guess.charAt(0);

    }

    private void checkUserInput(){
        boolean lastGuessCorrect = random.addGuess(lastGuess);

        if (lastGuessCorrect){
            triesRemaining = 5;

            if (random.isComplete()){
                System.out.println("You have won!");
                System.out.println("The word is: " + random);
                running = false;
            }
        }
        else{
            triesRemaining--;

            if (triesRemaining == 0){
                System.out.println("Game over! Better luck next time!");
                running = false;
            }
            else{
                System.out.println("Wrong guess!");
                System.out.println("Tries Remaining: " + triesRemaining);
            }
        }

    }

    public void close(){
        input.close();
    }
}
