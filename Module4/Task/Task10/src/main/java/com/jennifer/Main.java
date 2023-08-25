package com.jennifer;

import java.util.Scanner;

public class Main {
    // Method to verify visitors for Testify Training
    public static void verifyForTestifyTraining(String message) {
        if (message.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome to Testify Training!");
        } else {
            System.out.println("Sorry, you cannot enrol for Testify Training.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String userMessage = scanner.nextLine();

        // Invoke the verification method
        verifyForTestifyTraining(userMessage);

        scanner.close();
    }
}



//Create a method that verify that visitors on the Slack channel are coming fot testify Trainings.
//If they write" Testify" then print out a  welcome message if not, the user should be shown
// rejection message. after creating this method,then invoke the created method in your main method