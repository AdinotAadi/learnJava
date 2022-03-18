package com.adinotaadi.Conditionals;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to find even numbers upto: ");
        num = scan.nextInt();

        for ( int i = 1; i <= num; i++ ) {
            if ( i%2 == 0 ) {
                System.out.printf(" %d is an even number.\n", i);
            }
        }

        scan.close();
    }
}
