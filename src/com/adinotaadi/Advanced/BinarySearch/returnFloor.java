package com.adinotaadi.Advanced.BinarySearch;

import java.util.Scanner;

public class returnFloor {
    static int floorBS(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if (num == arr[mid]) {
                return mid;
            }
            else if (num < arr[mid]) {
                start = mid + 1;
            }
            else if (num > arr[mid]) {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] rollNum = {1, 36, 37, 39, 42};
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(floorBS(rollNum, input));
    }
}
