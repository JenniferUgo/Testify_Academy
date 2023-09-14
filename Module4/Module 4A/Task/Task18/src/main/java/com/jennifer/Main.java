package com.jennifer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Your age is: " + age);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid age as a number.");
        }

        scanner.close();
    }
}



//Write a code that asks the user for age and that accepts the Integer value. Handle the error that is encountered
// when the user tries to enter a name instead of age