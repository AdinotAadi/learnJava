package com.adinotaadi.Advanced.ArrayList;

import java.util.Arrays;

public class multidimensionalArrays {
    public static void main(String[] args) {
        int[][] I2 = {{1, 0}, {0, 1}};
        int[][] I3 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        for (int i = 0; i < I2.length; i++) {
            System.out.println(Arrays.toString(I2[i]));
        }

        for (int i = 0; i < I3.length; i++) {
            System.out.println(Arrays.toString(I3[i]));
        }
    }
}
