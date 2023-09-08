package com.jennifer;

public class ReverseStringRecursively {
    public static void main(String[] args) {
        String input = "TestifyAutomation";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        if (input.isEmpty() || input.length() == 1) {
            return input;
        }

        char firstChar = input.charAt(0);
        String restOfString = input.substring(1);

        return reverseString(restOfString) + firstChar;
    }
}



//Reverse "TestifyAutomation" using recursion in Java

