package com.company.lab1;

import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner fin = new Scanner( System.in );
        int n = fin.nextInt();
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
