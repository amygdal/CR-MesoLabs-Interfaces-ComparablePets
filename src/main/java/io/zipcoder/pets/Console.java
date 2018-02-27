package io.zipcoder.pets;

import java.util.Scanner;

public class Console {

    static Scanner myScanner= new Scanner(System.in);

    public static String getString(String prompt){
        print(prompt);
        String input = myScanner.nextLine();
        return input;
    }

    public static int getInt(String prompt){
        String userInput = getString(prompt);
        int integerInput = Integer.parseInt(userInput);
        return integerInput;
    }

    public static void print(String whatever) {
        System.out.println(whatever);
    }

}
