package com.fundamentals.userinput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputBufferedReader {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your given name: ");
        String givenName = reader.readLine();

        System.out.print("Enter your last name: ");
        String lastName = reader.readLine();

        System.out.println("Hello, " + givenName + " " + lastName);
    }
}
