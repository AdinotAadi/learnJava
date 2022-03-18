package com.adinotaadi.Advanced.ArrayList;

public class arraysIntro {
    public static void main(String[] args) {
        // Store 5 roll numbers in an array.
        /*  int[] rollNum;  // Declaration.
            rollNum = new int[5];   // Initialization.
            or simply as
            int[] rollNum = {42, 39, 37, 36, 01};
         */
        int[] rollNum = {42, 39, 37, 36, 1};

        for (int i = 0; i < rollNum.length; i++) {
            System.out.println(rollNum[i]);
        }
    }
}
