package com.jennifer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;

        // Keep prompting the user until they enter "testify"
        do {
            System.out.print("Enter 'testify': ");
            userInput = scanner.nextLine();
            if (!userInput.equals("testify")) {
                System.out.println("Try again.");
            }
        } while (!userInput.equals("testify"));

        System.out.println("You got it!!.");
        scanner.close();
    }
}

//Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"