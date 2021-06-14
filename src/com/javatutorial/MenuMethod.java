package com.javatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MenuMethod {
    String [] options = {"View database.", "Add an item.", "Delete an item.", "Quit the program."};

    String display(){

        String menuText = "Choose an option:\n";

        for (int i = 1; i <= options.length; i++){
           menuText += String.format("%d. %s\n", i, options[i-1]);
        }

        return menuText;
    }



}
