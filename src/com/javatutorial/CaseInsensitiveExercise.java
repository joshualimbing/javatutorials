package com.javatutorial;

import java.util.Scanner;

public class CaseInsensitiveExercise {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a command > ");
            String command = input.nextLine();

            if (command.length() != 0){
                if (command.equalsIgnoreCase("start"))
                    System.out.println("Machine Starting...");
                else if (command.equalsIgnoreCase("stop"))
                    System.out.println("Machine Stopping...");
                else if (command.equalsIgnoreCase("quit")){
                    break;
                }
                else
                    System.out.println("Unrecognized command!");
            }
        }while(true);

    }

}
