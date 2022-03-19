package com.adinotaadi.Advanced.BinarySearch;

import java.util.Scanner;

public class BSIntro {
    static int BinarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = start + ((end - start) / 2);  // Simply taking start+end/2 may result in a very large number if the array is very large.
            if (num == array[mid]) {    // Best case scenario, we find the element we want at the middle of the array.
                return mid;
            }
            else if (num < array[mid]) {    // If the element we want is smaller than the element at the middle of the array, we make the middle index the ending point.
                end = mid - 1;
            }
            else if (num > array[mid]) {    // If the element we want is larger than the element at the middle of the array, we make the middle index the starting point.
                start = mid + 1;
            }
        }
        return -1;  // If the array does not have the element we want, the program returns -1.
    }

    public static void main(String[] args) {
        int[] rollNum = {1, 36, 37, 39, 42};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int input = scan.nextInt();

        System.out.printf("%d.", BinarySearch(rollNum, input));

        scan.close();
    }
}
