package com.javatutorial;

import java.util.Objects;
import java.util.Scanner;

public class PasswordLoop {

    public static void main(String[] args){

        final String USER_PASSWORD = "hello";


        do {
            System.out.print("Enter password > ");
            Scanner input = new Scanner(System.in);

            String password = input.nextLine();

            if (Objects.equals(password, USER_PASSWORD)) {
                System.out.println("Access granted!");
                break;
            }
            else{
                System.out.println("Access denied!");
                continue;
            }

        }while(true);
    }

}
