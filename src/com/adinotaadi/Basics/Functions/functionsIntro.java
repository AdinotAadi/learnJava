package com.adinotaadi.Basics.Functions;

import java.util.Scanner;

public class functionsIntro {
    // By convention all the functions should be declared at the top of the program, followed by the main function.
    static int factorial(int num) { // Function declaration, static must be used to make the function usable in the program.
        if ( num == 1 || num == 0) {
            return 1;
        }
        else {
            return num * factorial(num-1);  // Recursively finds the factorial of the number "num".
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial of: ");
        num = scan.nextInt();
        System.out.printf("The factorial of %d is %d.", num, factorial(num));   // Prints the answer in the formatted string.

        scan.close();
    }
}
