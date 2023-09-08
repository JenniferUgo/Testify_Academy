package com.jennifer;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String inputString = "Despite commuting at the peek hour, she was able to keep totime";

        if (isSelfAnagram(inputString)) {
            System.out.println("Here are the anagrams in the string");
        } else {
            System.out.println("There are no anagrams in this string.");
        }
    }

    // Check if a string has an anagram
    public static boolean isSelfAnagram(String inputString) {
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        // Convert the string to a character array, sort it, and compare with itself
        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);

        // Create a sorted version of the original string
        String sortedString = new String(charArray);

        // Compare the sorted string with the original (ignoring case)
        return sortedString.equalsIgnoreCase(inputString);
    }
}



//Using  Java  Code,  check  for  Anagrams  in  these  strings:
// "Despite commuting at the peek hour, she was able to keep totime