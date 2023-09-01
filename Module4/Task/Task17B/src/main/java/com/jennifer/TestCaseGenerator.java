package com.jennifer;

import java.util.Scanner;

public class TestCaseGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather test case information
        System.out.println("Test Case Title: ");
        String title = scanner.nextLine();

        System.out.println("Test Case ID: ");
        String testCaseID = scanner.nextLine();

        System.out.println("Objective: ");
        String objective = scanner.nextLine();

        System.out.println("Preconditions:");
        String preconditions = scanner.nextLine();

        System.out.println("Test Steps (Enter 'done' to finish):");
        String testSteps = "";
        String step;
        while (true) {
            step = scanner.nextLine();
            if (step.equalsIgnoreCase("done")) {
                break;
            }
            testSteps += " - " + step + "\n";
        }

        System.out.println("Postconditions: ");
        String postconditions = scanner.nextLine();

        System.out.println("Test Data: ");
        String testData = scanner.nextLine();

        System.out.println("Test Pass Criteria: ");
        String passCriteria = scanner.nextLine();

        System.out.println("Test Fail Criteria:");
        String failCriteria = scanner.nextLine();

        System.out.println("Notes:");
        String notes = scanner.nextLine();

        // Print the generated test case
        System.out.println("\nGenerated Test Case:");
        System.out.println("**Test Case Title:** " + title);
        System.out.println("**Test Case ID:** " + testCaseID);
        System.out.println("**Objective:** " + objective);
        System.out.println("**Preconditions:**\n" + preconditions);
        System.out.println("**Test Steps:**\n" + testSteps);
        System.out.println("**Postconditions:**\n" + postconditions);
        System.out.println("**Test Data:**\n" + testData);
        System.out.println("**Test Pass Criteria:** " + passCriteria);
        System.out.println("**Test Fail Criteria:** " + failCriteria);
        System.out.println("**Notes:** " + notes);

        scanner.close();
    }
}


//All testers in your unit must test that the correct username is entered, correct password that matches the
// username and that Login to the homePage or dashboard is successful. As the test Lead, create an interface that the
// testers should use