package com.adinotaadi.Advanced.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> rollNum = new ArrayList<>(5); // ArrayList declaration.
        // An array list can contain infinite amount of elements (technically).

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element to add to the array list: ");
            rollNum.add(scan.nextInt());    // Elements can be added to an array list using the ".add(<element>)" method.
        }

        System.out.println(rollNum);

        scan.close();
    }
}
