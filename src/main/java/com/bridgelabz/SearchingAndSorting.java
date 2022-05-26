package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingAndSorting {

    public static void checkAnagram(char[] str1, char[] str2) {
        int str_1length = str1.length;
        int str_2Length = str2.length;
        boolean check = true;

        if (str_1length != str_2Length) {
            System.out.println("The two strings are not anagram of each other");
        } else {
            Arrays.sort(str1);
            Arrays.sort(str2);
            for (int i = 0; i < str_1length; i++)
                if (str1[i] != str2[i]) {
                    check = false;
                }
            if (check)
                System.out.println("The two strings are anagram of each other !");
            else
                System.out.println("The two strings are not  anagram of each other !");
        }
    }

    public static void main(String args[]) {
        System.out.println("------------ Welcome To Anagram Program -------------");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String firstStr = sc.next();
        System.out.println("Enter Second String : ");
        String secondStr = sc.next();

        checkAnagram(firstStr.toCharArray(), secondStr.toCharArray());
    }
}