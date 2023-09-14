package com.jennifer;

public class Main {
    public static void main(String[] args) {
        // Method 1: String and String concatenation
        int age = 25;
        String objective = "years old";
        String message1 = "I am " + age + " years old.";
        System.out.println("Method 1: " + message1);


        // Method 2: String and primitive type concatenation
        String newMessage = "I am " + Integer.toString(age) + " years old.";
        System.out.println("Method 2: " + newMessage);


    }
}

// Create a variable and store an age in it. concatenate the age with a string and print it out on the console
// using two methods of concatenation:
// - string to strong concatenation and string to primitive type concatenation methods