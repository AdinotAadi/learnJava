package com.adinotaadi.Advanced.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class multiAL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  // Multidimensional ArrayList declaration.
        for (int i = 0; i < 3; i ++) {
            list.add(new ArrayList<>());    // Adds 3 empty ArrayLists, i.e, Initializes the ArrayList.
        }

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                list.get(i).add(scan.nextInt());    // Gets the ArrayList at the i-th index and adds the element passed through ".add()" method.
            }
        }

        System.out.println(list);

        scan.close();
    }
}
