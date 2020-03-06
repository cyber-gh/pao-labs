package com.company.lab2;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        int odd = 0, even = 0;
        int[] arr1 = new int[50];
        int[] arr2 = new int[50];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                arr1[even++] = x;
            } else {
                arr2[odd++] = x;
            }
        }

        if (even > odd) {
            for (int i = 0; i < even; i++) {
                System.out.println(arr1[i]);
            }
        } else {
            for (int i = 0; i < odd; i++) {
                System.out.println(arr2[i]);
            }
        }
    }
}
