package com.adinotaadi.Advanced.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class usrInputToArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your roll numbers: ");
        int[] rollNum = new int[5];

        for (int i = 0; i < 5; i++) {
            rollNum[i] = scan.nextInt();
        }

        System.out.print("You've entered the following roll numbers: ");
        System.out.print(Arrays.toString(rollNum));
    }
}
