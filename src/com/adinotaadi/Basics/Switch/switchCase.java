package com.adinotaadi.Basics.Switch;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        String fruitName;
        System.out.print("Enter the name of a fruit: ");
        Scanner scan = new Scanner(System.in);

        fruitName = scan.next();

        switch (fruitName) {    // Switch opening.
            case "Mango":   // Case condition 1.
                System.out.println("King of fruits.");  // Code if case 1 is true.
                break;  // Exits the condition check.
            case "Apple":
                System.out.println("Sweet red fruit.");
                break;
            default:    // Default, if none of the cases are true.
                System.out.println("Enter the name of a fruit.");
                break;
        }
    }
}
