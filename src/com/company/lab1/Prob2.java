package com.company.lab1;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner fin = new Scanner( System.in );
        int a = fin.nextInt(), b = fin.nextInt();

        System.out.println("mai mare = " + Math.max(a, b));
    }
}
