package com.adinotaadi.Basics.IO;

import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner is a java utility used to take user input.
        System.out.print("Enter two numbers of your choice: ");
        int num1 = scan.nextInt();  // Takes in an integer input from the user.
        int num2 = scan.nextInt();  // Takes in an integer input from the user.

        int sum = num1 + num2;  // Adds the two numbers.
        int diff = num1 - num2; // Subtracts the two numbers.
        int prod = num1 * num2; // Multiplies the two numbers.
        float quo = num1 / (float) num2; // Divides the two numbers, after converting num2 to a float data type to get the result in float.

        System.out.printf("Addition: %d\n", sum); // Prints out a formatted output, %d is the placeholder for the sum variable in the string. "\n" is the escape character for new line.
        System.out.printf("Subtraction: %d\n", diff);
        System.out.printf("Product: %d\n", prod);
        System.out.printf("Quotient: %f", quo);

        scan.close(); // Closes the scanner object.
    }
}
