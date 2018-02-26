package io.zipcoder.pets;

import java.util.Scanner;

public class Console {
    private static Scanner theScanner = new Scanner(System.in);

    public static String getString() {
        return theScanner.next();
    }

    public static int getInt() {
        return theScanner.nextInt();
    }

    public static void print(String something) {
        System.out.println(something);
    }

}
