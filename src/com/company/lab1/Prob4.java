package com.company.lab1;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner fin = new Scanner( System.in );
        long n = fin.nextLong();
        System.out.println(factorial(n));
    }

    public static long factorial(long n){
        int ans = 1;
        for (int i = 1; i <= n ; i++) {
            ans *= i;
        }
        return ans;
    }
}
