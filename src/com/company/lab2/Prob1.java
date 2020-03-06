package com.company.lab2;

import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[100];
        int idx = 0;
        while (true) {
            int x = scan.nextInt();
            if (x == -1) break;
            arr[idx++] = x;
        }

        float avg = 0;
        for (int i = 0; i < idx; i++) {
            avg += arr[i];
        }

        System.out.println(avg / idx);
    }
}
