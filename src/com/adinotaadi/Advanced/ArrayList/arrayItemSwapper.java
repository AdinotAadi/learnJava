package com.adinotaadi.Advanced.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class arrayItemSwapper {
    static void swapper(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4};   // Array declaration and initialization.

        System.out.print("The array before swapping the elements is: ");
        System.out.println(Arrays.toString(arr));   // Array with no changes is printed.

        System.out.println("Enter the index number to swap (0-3): ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        swapper(arr, a, b); // Function call, which takes in the array and the two indexes to swap the elements of.

        System.out.print("The array after swapping is: ");
        System.out.println(Arrays.toString(arr));   // Array with swapped elements is printed.

        scan.close();
    }
}
