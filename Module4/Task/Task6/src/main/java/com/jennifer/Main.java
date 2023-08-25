package com.jennifer;

public class Main {
    public static void main(String[] args) {

        String word = "DEMOCRACY";

        // Create a StringBuilder and append the original string
        StringBuilder reversed = new StringBuilder(word);

        // Reverse the StringBuilder
        reversed.reverse();

        // Convert the reversed StringBuilder back to a string
        String reversedString = reversed.toString();

        // Print the reversed string
        System.out.println("Original string: " + word);
        System.out.println("Reversed string: " + reversedString);

        System.out.println("Spliced word: "+ reversedString.substring(4,8));

    }
}



// YCARCOMED
// 012345678
//Write a code to reverse the string DEMOCRACY and get the word COME out of it.