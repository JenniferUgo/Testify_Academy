package com.jennifer;

public class ReverseWordsRecursively {
    public static void main(String[] args) {
        String sentence = "I am the best Automation Tester";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        if (sentence.isEmpty() || sentence.trim().isEmpty()) {
            return sentence;
        }

        int spaceIndex = sentence.indexOf(' ');

        if (spaceIndex == -1) {
            return sentence;
        }

        String firstWord = sentence.substring(0, spaceIndex);
        String restOfSentence = sentence.substring(spaceIndex + 1);

        return reverseWords(restOfSentence) + " " + firstWord;
    }
}

// reverse the position of the words in " I am the best Automation Tester" using recursion