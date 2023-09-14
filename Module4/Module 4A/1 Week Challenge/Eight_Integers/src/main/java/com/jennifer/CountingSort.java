package com.jennifer;

public class CountingSort {
    public static void main(String[] args) {
        int[] inputArray = {3, 2, 4, 1, 5, 5, 2, 3, 1, 4, 4, 2, 1, 3, 2, 5, 5, 1, 4, 3};
        int[] sortedArray = countingSort(inputArray, 1, 5);

        // Print the sorted array
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] countArray = new int[range];
        int[] sortedArray = new int[arr.length];

        // Count the occurrences of each integer
        for (int num : arr) {
            countArray[num - min]++;
        }

        // Calculate the prefix sum
        for (int i = 1; i < range; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Place the elements in the sortedArray
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArray[countArray[arr[i] - min] - 1] = arr[i];
            countArray[arr[i] - min]--;
        }

        return sortedArray;
    }
}


//Given a collection of 1 million integers, all ranging between 1 - 9, sort them in Big O(n) time