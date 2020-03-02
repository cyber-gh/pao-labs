package com.company.lab1;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner fin = new Scanner( System.in );
        int n = fin.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }
}
