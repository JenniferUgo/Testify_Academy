package com.jennifer;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "10801";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }

        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Write  Java  code  to  check  if  racecar  and  10801  is  apalindromes.