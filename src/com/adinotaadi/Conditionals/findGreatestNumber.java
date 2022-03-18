package com.adinotaadi.Conditionals;

import java.util.Scanner;

public class findGreatestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ( a > b ) {
            if ( b > c ) {
                System.out.printf("%d > %d > %d", a, b, c);
            }
            else {
                System.out.printf("%d > %d > %d", a, c, b);
            }
        }
        else if ( b > c ) {
            if ( a > c ) {
                System.out.printf("%d > %d > %d", b, a, c);
            }
            else {
                System.out.printf("%d > %d > %d", b, c, a);
            }
        }
        else if ( c > a ) {
            if ( a > b ) {
                System.out.printf("%d > %d > %d", c, a, b);
            }
            else {
                System.out.printf("%d > %d > %d", c, b, a);
            }
        }
    }
}
