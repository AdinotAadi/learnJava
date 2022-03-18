package com.adinotaadi.Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to print the multiplication table of: ");
        num = scan.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
            i++;
        }
    }
}
