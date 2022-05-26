package com.bridgelabz;

import java.util.*;

public class SearchingAndSorting {

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("-------- Welcome to Bubble Sort Program -----------");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many number you want to sort : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter numbers to sort : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Print original array
        System.out.print("\nArray before sorting : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n");

        // calling bubble sort method
        bubbleSort(array);
        System.out.print("Array after sorting : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}