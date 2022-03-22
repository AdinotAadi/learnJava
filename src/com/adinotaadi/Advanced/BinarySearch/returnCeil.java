package com.adinotaadi.Advanced.BinarySearch;

import java.util.Scanner;

public class returnCeil {
    // The following program return the largest number smaller than the input number.
    static int ceilBS(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if (num == arr[mid]) {  // If the answer is found, the index of the number found is returned.
                return mid;
            }
            else if (num < arr[mid]) {  // If middle element is larger than the given input, the end pointer is changed to index "mid - 1".
                end = mid - 1;
            }
            else if (num > arr[mid]) {  // If middle element is smaller than the given input, the start pointer is changed to index "mid + 1".
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] rollNum = {1, 36, 37, 39, 42};
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(ceilBS(rollNum, input));
    }
}
