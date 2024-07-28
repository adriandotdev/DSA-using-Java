package com.fundamentals.userinput;

import java.util.Scanner;

public class UserInputScanner {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your given name: ");
        String givenName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("Hello, " + givenName + " " + lastName);
    }
}
