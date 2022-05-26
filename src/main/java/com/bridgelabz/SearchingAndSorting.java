package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingAndSorting {

    // check number is prime or not
    public static boolean checkPrime(int num) {
        // zero and one is not prime number
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // check number is palindrome or not
    public static boolean checkPalindrome(int num) {
        int r, sum = 0;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    // check number is anagram or not
    public static boolean checkAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(" Prime Numbers that are Anagram and pallindrome between 0 to 1000 : ");
        for (int i = 0; i <= 1000; i++) {
            // check number is prime as well as palindrome or not
            if (checkPrime(i) == true && checkPalindrome(i)) {
                // check number is anagram or not
                boolean result = checkAnagram(String.valueOf(i), String.valueOf(i));
                if (result == true) {
                    System.out.println(" " + i);
                }
            }
        }
    }
}