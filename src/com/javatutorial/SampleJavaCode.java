package com.javatutorial;

import java.util.Scanner;

public class SampleJavaCode {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String prompt = "Select an option: \n";
        String option1 = "Add an entry";
        String option2 = "View the database";
        String option3 = "Exit";

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;

        String menu = "";

        menu += prompt + "\t" + value1 + "." + option1 + "\n";
        menu += "\t" + value2 + "." + option2 + "\n";
        menu += "\t" + value3 + "." + option3 + "\n";

        System.out.println(menu);

    }

}
