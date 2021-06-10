package com.javatutorial;

import java.util.Scanner;

public class LimitedAttempts {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        final String USER_PASSWORD = "helloworld";

        boolean correctPassword = false;

        for (int i = 1; i <= 3; i++){
            System.out.print("Enter Password > ");
            String inputPassword = input.next();

            if(inputPassword.equals(USER_PASSWORD)){
                System.out.println("Access granted!");
                correctPassword = true;
                break;
            }
            else
                System.out.println("Incorrect password!");
        }

        if (!correctPassword){
            System.out.println("Access denied!");
        }

    }

}
