package com.company.lab5.prob2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Album arr[] = new Album[3];
        arr[0] = new Album("Test", 1990, 2);
        arr[1] = new Album("Test", 1990, 1);
        arr[2] = new Album("Test", 1990, 4);
        for (Album album : arr) {
            System.out.println(album);
        }

        Arrays.sort(arr);
        System.out.println();

        for (Album album : arr) {
            System.out.println(album);
        }


    }
}
