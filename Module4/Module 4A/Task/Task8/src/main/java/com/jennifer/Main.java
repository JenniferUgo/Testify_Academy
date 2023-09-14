package com.jennifer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        // Get user's age
        Scanner userInput = new Scanner(System.in);
        System.out.print("Welcome, please input your year of birth ");

        short yob = userInput.nextShort();
        short presentYear = 2023;
        int userAge = presentYear - yob;

        System.out.println("You are " + userAge +" years old");

        if (userAge < 16) {
            System.out.println("You are too young to get a license, sorry!");
        } else if (userAge >=16) {
            System.out.println("Great, you're old enough to get a license");
        }

    }
}

//Build a Simple interest calculator. Write a program to ask the user for the
// necessary field you need in calculating the simple interest and then communicate
// the simple interest back to the user is a good sentence

