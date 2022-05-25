package com.bridgelabz;

import java.util.Arrays;

public class SearchingAndSorting {
    // Bubble sorting
    private static String[] sortArray(String[] str) {
        String temp;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        return str;
    }
    // Binary search method to search word
    private static int binarySearch(String[] str1, String search) {

        int start = 0, size = str1.length - 1;
        while (start <= size) {
            int mid = start + (size - start) / 2;
            int res = search.compareTo(str1[mid]);

            // Check if search word is present at mid
            if (res == 0)
                return mid;
            // If search word greater, ignore left half
            if (res > 0)
                start = mid + 1;
                // If search word is smaller, ignore right half
            else
                size = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("------------- Welcome to Binary Search Program -----------");
        System.out.println();

        String[] inputArr = {"TCS", "Infosys", "Bridgelabz", "Wipro", "Bajaj"};
        System.out.println("\nBefore sorting:" + Arrays.toString(inputArr));

        // sort string
        String[] sortedArr = sortArray(inputArr);
        System.out.println("\nAfter sorting:" + Arrays.toString(sortedArr));

        // word to search in string
        String search = "Bridgelabz";
        int result = binarySearch(sortedArr, search);

        if (result == -1)
            System.out.println("\n" + search + " = Word not present in String");
        else
            System.out.println("\n" + search + " = Word found in String after sorting at index: " + result);
    }
}
