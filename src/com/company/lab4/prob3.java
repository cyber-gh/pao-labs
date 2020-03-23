package com.company.lab4;

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m * n];
        int ans = 0;
        for (int i = 0; i < m * n; i++) {
            int tmp = scanner.nextInt();
            if (!isPrime(tmp)) ans++;
        }

        System.out.println(ans);
    }

    public static boolean isPrime(int x) {
        if (x == 0 || x == 1) return false;
        for (int i = 2; i * i <= x ; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
