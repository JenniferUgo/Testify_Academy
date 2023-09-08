package com.jennifer;

public class MaxProductInArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};

        if (nums.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        long maxProduct = (long) max1 * max2;

        System.out.println("The two numbers with maximum product are: " + max1 + " and " + max2);
        System.out.println("Maximum product is: " + maxProduct);
    }
}

//Find 2 numbers of which the product is a maximum in an array
