package com.adinotaadi.Advanced.BinarySearch;

import java.util.Scanner;

public class reverseBS {
    static int reverseBinarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (num == array[mid]) {
                return mid;
            }
            else if (num > array[mid]) {
                end = mid - 1;
            }
            else if (num < array[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rollNum = {42, 39, 37, 36, 1};
        System.out.print("Enter the number to search in the array: ");
        int input = scan.nextInt();
        System.out.println(reverseBinarySearch(rollNum, input));
    }
}
