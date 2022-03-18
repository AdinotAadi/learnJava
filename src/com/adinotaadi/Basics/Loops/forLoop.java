package com.adinotaadi.Basics.Loops;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        float num;  // Reserves a memory location to store a float value.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to print the table of: ");
        num = scan.nextFloat(); // Takes in user input, and assign it to the num variable.

        for (int i = 1; i <= 10; i++) { // Loops from 1, to 10, both inclusive.
            System.out.printf("%.2f x %d = %.2f\n", num, i, num*i); // Prints out "num x i = num*i" and a new line escape character.
        }

        scan.close();   // Closes the scanner object.
    }
}
