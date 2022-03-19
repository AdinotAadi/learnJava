package com.adinotaadi.Advanced.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] rollNum = {42, 39, 37, 35, 1};

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to search in the array: ");
        int input = scan.nextInt();

        for (int i = 0; i < rollNum.length; i++) {
            if (rollNum[i] == input) {
                System.out.printf("The element %d is found at the %dth index", input, i);
            }
        }
    }
}
