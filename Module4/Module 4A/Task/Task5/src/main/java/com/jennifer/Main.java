package com.jennifer;

public class Main {
    public static void main(String[] args) {
        // Define the range of numbers to check
        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

//Write a code to: If the number is divisible by 3, print Fizz instead of the number.
//If the number is divisible by 5, print Buzz instead of the number.
//If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.